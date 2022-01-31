package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;


public class Ecouteur implements EventHandler<ActionEvent> {

    private int compteur;
    private Label lab1;
    private Label lab2;
    private Label lab3;

    public Ecouteur(Label l1, Label l2, Label l3){ //3 label en entre pour la question 5 ? Random 1-6
        compteur = 0;
        lab1 = l1;
        lab2 = l2;
        lab3 = l3;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Bienvenito ! Ce qui en italien signifie : Bienvenue !!");
        compteur++;
        System.out.println("Vous avez appuyé " + compteur +"x sur le bouton !\n");
        int nb1 = (int)(Math.random()*6) + 1;
        int nb2 = (int)(Math.random()*6) + 1;
        int nb3 = (int)(Math.random()*6) + 1;
        lab1.setText(String.valueOf(nb1));
        lab2.setText(String.valueOf(nb2));
        lab3.setText(String.valueOf(nb3));
    }
}
