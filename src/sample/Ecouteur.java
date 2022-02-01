package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;


public class Ecouteur implements EventHandler<ActionEvent> {

    private int compteur;
    private int nbCombi;
    private Label lab1;
    private Label lab2;
    private Label lab3;
    private Label LabCompteur;
    private Label LabCompteurCombi;
    private Label labCompteur;
    private Label labCompteurCombi;

    public Ecouteur(Label l1, Label l2, Label l3, Label l4, Label l5){ //3 label en entre pour la question 5 ? Random 1-6
        compteur = 0;
        nbCombi = 0;
        lab1 = l1;
        lab2 = l2;
        lab3 = l3;
        labCompteur = l4;
        labCompteurCombi = l5;
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
        labCompteur.setText(String.valueOf("Nb press bouton : " + compteur + " /"));
        if(nb1 == 4 && nb2 == 2 && nb3 == 1){
            nbCombi++;
        }
        labCompteurCombi.setText(" Nombre 421 : " + String.valueOf(nbCombi) + " ");
    }

}
