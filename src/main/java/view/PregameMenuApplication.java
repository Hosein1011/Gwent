package view;

import controller.PregameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PregameMenuApplication extends Application {
    private final double paneHeight = 650;
    private final double paneWidth = 1150;
    private final double cardWidth = 0 ;
    private final double cardHeight = 0 ;

    private Pane pane ;
    @Override
    public void start(Stage stage) throws Exception {
        PregameController.setPregameMenuApplication(this);
        PregameController.setPregamePane(pane);
        newPane();
        stage.setScene(new Scene(pane));
        stage.show();
    }

    private void newPane(){
        pane = new Pane();
        setSize();
        setRandomFaction();
        setRandomLeader();
        addBasicIcons();
        PregameController.setShowingCards();
    }

    private void setRandomLeader(){
        //can be not random
    }

    private void setRandomFaction(){
        //can be not random
    }

    private void setSize(){

    }

    private void addBasicIcons() {

    }
}
