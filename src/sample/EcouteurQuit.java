package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;


public class EcouteurQuit implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent actionEvent) {
        Platform.exit();
    }
}
