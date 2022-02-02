package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


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
        //Partie terminal
        System.out.println("Bienvenito ! Ce qui en italien signifie : Bienvenue !!");
        compteur++;
        System.out.println("Vous avez appuyé " + compteur +"x sur le bouton !\n");

        //Setup aléatoire des dés
        int nb1 = (int)(Math.random()*6) + 1;
        int nb2 = (int)(Math.random()*6) + 1;
        int nb3 = (int)(Math.random()*6) + 1;
        String strD1 = "ressources/dice_"+ nb1 +".png";
        String strD2 = "ressources/dice_"+ nb2 +".png";
        String strD3 = "ressources/dice_"+ nb3 +".png";

        //Partie dés
        Image imgD1 = new Image(strD1,60,60,true,true);
        ImageView d1 = new ImageView(imgD1);
        lab1.setGraphic(d1);
        Image imgD2 = new Image(strD2,60,60,true,true);
        ImageView d2 = new ImageView(imgD2);
        lab2.setGraphic(d2);
        Image imgD3 = new Image(strD3,60,60,true,true);
        ImageView d3 = new ImageView(imgD3);
        lab3.setGraphic(d3);

        //Partie haute
        labCompteur.setText(String.valueOf("Nb press bouton : " + compteur + " /"));
        if(nb1 == 4 && nb2 == 2 && nb3 == 1){
            nbCombi++;
        }
        labCompteurCombi.setText(" Nombre 421 : " + String.valueOf(nbCombi) + " ");
    }

}
