package view;

import controller.GameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class GameApplication extends Application {
    private final double Height = 650;
    private final double Width = 1150;
    private final double leaderHeight = 78;
    private final double leaderWidth =57;
    private final double leaderX = 85 ;
    private final double leader1Y =503 ;
    private final double leader2Y = 50 ;
    private Pane pane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        newPane();
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public Pane getPane() {
        return pane;
    }

    private void newPane() {
        pane = new Pane();
        setSize(pane);
        pane.setBackground(new Background(getBackground()));
        addLeader();
    }

    private void setSize(Pane pane) {
        pane.setMinHeight(Height);
        pane.setMaxHeight(Height);
        pane.setMinWidth(Width);
        pane.setMaxWidth(Width);
    }

    private BackgroundImage getBackground() {
        Image image = new Image(GameApplication.class.getResource("/img/board.jpg").toExternalForm(), Width, Height, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        return backgroundImage;
    }

    private void addLeader(){
        Rectangle leader1 = GameController.getPlayerOne().getLeader();
        Rectangle leader2 = GameController.getPlayerTwo().getLeader();
        leader1.setHeight(leaderHeight);
        leader1.setWidth(leaderWidth);
        leader2.setHeight(leaderHeight);
        leader2.setWidth(leaderWidth);
        leader1.setY(leader1Y);
        leader1.setX(leaderX);
        leader2.setY(leader2Y);
        leader2.setX(leaderX);
        pane.getChildren().add(leader1);
        pane.getChildren().add(leader2);
    }
}
