package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Ecouteur implements EventHandler<ActionEvent> {

    public Ecouteur(){
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Bienvenito ! Ce qui en italien veut dire : Bienvenue !!");
    }
}
