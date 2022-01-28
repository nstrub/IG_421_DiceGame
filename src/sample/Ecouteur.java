package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Ecouteur implements EventHandler<ActionEvent> {

    private int compteur;

    public Ecouteur(){ //3 label en entre pour la question 5 ? Random 1-6
        compteur = 0;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Bienvenito ! Ce qui en italien signifie : Bienvenue !!");
        compteur++;
        System.out.println("Vous avez appuyé " + compteur +"x sur le bouton !\n");
    }
}
