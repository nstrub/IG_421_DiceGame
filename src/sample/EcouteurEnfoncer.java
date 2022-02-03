package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class EcouteurEnfoncer implements EventHandler<ActionEvent> {

    private Button bouton;

    public EcouteurEnfoncer(Button boubou){
        bouton = boubou;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        bouton.setDisable(true);
    }

}


