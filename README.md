# Gwent: The Witcher Card Game (JavaFX)

A desktop implementation of The Witcher 3's Gwent card game written in Java 17/21 using OpenJFX (JavaFX 19). Developed as the semester final project for the Advanced Programming (AP) course at Sharif University of Technology.

---

## Architecture & System Design

The application follows a Model-View-Controller (MVC) architecture with FXML-driven scenes, media player acceleration, and coordinate-based board rendering.

```
                      +-----------------------------+
                      |        User Input           |
                      |   (Mouse, Keyboard, FXML)   |
                      +--------------+--------------+
                                     |
                                     v
+------------------------------------+------------------------------------+
|                          CONTROLLER LAYER                               |
|  - GameController: Round orchestration, turn states, passing, scores    |
|  - GameMainController: Card placement, ability triggers, row scoring    |
|  - LoginMenuController / RegisterMenuController: User auth & storage    |
|  - MainMenuController / ProfileController: Navigation & history         |
|  - PregameController: Faction selection & 22-card minimum deck builder  |
+------------------+----------------------------------+-------------------+
                   |                                  |
                   v                                  v
+------------------+---------------+  +---------------+-------------------+
|            MODEL LAYER           |  |            VIEW LAYER             |
| - CardType: Full card database   |  | - FXML Scenes: Login, Register,   |
|   (Combat, Agile, Hero, Weather) |  |   Main Menu, Profile, History     |
| - GameField: 3-row state model   |  | - GameApplication: Custom board   |
|   (Melee, Ranged, Siege + Debuff)|  |   canvas (1150x650 coordinate map)|
| - Player: Deck, hand, discard    |  | - Media Player: Video background  |
| - UserStorage: Auth persistence  |  |   playback via javafx-media       |
+----------------------------------+  +-----------------------------------+
```

---

## Technical Features

### 1. Game Engine & Card Mechanics (`src/main/java/model/CardType.java`)
- **Full Faction Catalog:** Complete card databases for Skellige, Scoia'tael, Monsters, Northern Realms, and the Nilfgaardian Empire.
- **Card Ability Resolution:**
  - **Tight Bond:** Multiplies strength when identical units share a row.
  - **Morale Boost:** Adds +1 to all other row units.
  - **Commanders Horn:** Doubles row strength.
  - **Medic:** Revives eligible non-hero units from the discard pile.
  - **Spy:** Placed on opponent's field, granting 2 card draws to the caster.
  - **Scorch:** Destroys highest-strength non-hero cards on the board.
  - **Muster:** Automatically fetches and plays all matching copies from deck/hand.
  - **Hero Immunity:** Gold hero cards remain unaffected by weather debuffs, scorch, or horns.
- **Row & Weather Systems:** Independent Melee, Ranged, and Siege rows subject to row-specific weather cards (Biting Frost, Impenetrable Fog, Torrential Rain) setting non-hero card strength to 1, with Clear Weather clearing debuffs.

### 2. Graphical User Interface & Media Integration
- **FXML Scene Graphs:** Declarative views for authentication, player profile inspection, match history review, and pregame deck assembly.
- **Video Playback (`javafx-media`):** Hardware-accelerated background video rendering on the login screen (`LoginMenu_Background.mp4`).
- **Board Coordinate Mapping:** Absolute coordinate board overlay (1150 x 650 resolution) on `board.jpg`, dynamically positioning card slots, leader cards, weather slots, and live round score indicators.

### 3. Session & Deck Management
- **Pre-Game Deck Builder (`PregameController.java`):** Enforces Gwent deck-building constraints (minimum 22 unit cards, maximum 10 special cards, exactly 1 leader).
- **Match History & Profiles:** Persistent local record keeping of match outcomes, scores, and timestamps.

---

## Repository Structure

```
Gwent/
├── pom.xml                               # Java 17/21 Maven configuration & JavaFX dependencies
├── src/main/java/
│   ├── controller/                       # Game flow, deck selection, auth controllers
│   │   ├── CardCloning.java
│   │   ├── GameController.java
│   │   ├── GameMainController.java
│   │   ├── LoginMenuController.java
│   │   ├── MainMenuController.java
│   │   ├── PregameController.java
│   │   ├── ProfileController.java
│   │   └── RegisterMenuController.java
│   ├── model/                            # Domain entities, card enum, game field, player
│   │   ├── Action.java                   # Card ability definitions
│   │   ├── Card.java & InFieldCard.java
│   │   ├── CardType.java                 # Comprehensive Gwent card encyclopedia
│   │   ├── Faction.java                  # Faction identifiers & passives
│   │   ├── GameField.java                # Row scores & weather debuff state
│   │   ├── LeaderCard.java
│   │   └── Player.java & User.java
│   ├── view/                             # JavaFX Application entrypoints
│   │   ├── GameApplication.java          # In-game board canvas & coordinates
│   │   ├── LoginMenuApplication.java
│   │   ├── MainMenuApplication.java
│   │   └── PregameMenuApplication.java
│   └── module-info.java                  # Java 9+ module exports for OpenJFX
└── src/main/resources/
    ├── FXML/                             # FXML scene layouts (Login, Menu, Profile)
    ├── img/                              # Card artwork (lg/sm), icons, board.jpg
    └── video/                            # Login background video (MP4)
```

---

## Build & Execution

### Prerequisites
- JDK 17 or JDK 21 LTS
- Apache Maven 3.8+

```bash
# Clone the repository
git clone https://github.com/Hosein1011/Gwent.git
cd Gwent

# Compile and package
mvn clean compile

# Launch the application
mvn exec:java -Dexec.mainClass="view.LoginMenuApplication"
```
