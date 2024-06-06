package model;

public enum Action implements Runnable {
    decoy(() -> {}) ,
    tightBond(() -> {}),
    commandersHorn(() -> {}) ,
    muster(() -> {}) ,
    moralBoost(() -> {}) ,
    scorch(() -> {}) ,
    mardroeme(() -> {}) ,
    berserker(() -> {}) ,
    spy(() -> {}) ,
    medic(() -> {}) ,
    transFormers(() -> {}) ,
    //**********
    // Leaders Action ::

    theSiegeMaster(() -> {}) ,
    theSteelForged(() -> {}) ,
    kingOfTemeria(() -> {}) ,
    lordCommanderOfNorth(() -> {}) ,
    sonOfMedell(() -> {}) ,
    theWhiteFlame(() -> {}) ,
    hisImperialMajesty(() -> {}) ,
    emperorOfNilfgaard(() -> {}) ,
    theRelentless(() -> {}) ,
    invaderOfTheNorth(() -> {}) ,
    bringerOfDeath(() -> {}) ,
    kingOfTheWildHunt(() -> {}) ,
    destroyerOfWorlds(() -> {}) ,
    commanderOfTheRedRiders(() -> {}) ,
    theTreacherous(() -> {}) ,
    queenOfDolBlathanna(() -> {}) ,
    theBeautiful(() -> {}) ,
    daisyOfTheValley(() -> {}) ,
    pureBloodEif(() -> {}) ,
    hopeOFTheAenSeidhe(() -> {}) ,
    crachAnCraite(() -> {}) ,
    kingBran(() -> {}) ,
    ;
    Action(Runnable runnable){
        this.runnable = runnable;
    }
    private final Runnable runnable;
    @Override
    public void run() {
        runnable.run();
    }
}