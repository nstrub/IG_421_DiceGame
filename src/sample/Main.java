package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Button boutonJouer = new Button("Jouer");
        root.setBottom(boutonJouer);

        Label l1 = new Label();
        Image imgD1 = new Image("ressources/dice_1.png",60,60,true,true);
        ImageView d1 = new ImageView(imgD1);
        l1.setGraphic(d1);

        Label l2 = new Label();
        Image imgD2 = new Image("ressources/dice_1.png",60,60,true,true);
        ImageView d2 = new ImageView(imgD2);
        l2.setGraphic(d2);

        Label l3 = new Label();
        Image imgD3 = new Image("ressources/dice_1.png",60,60,true,true);
        ImageView d3 = new ImageView(imgD3);
        l3.setGraphic(d3);

        Label l4 = new Label("Nb press bouton : 0  /");

        Label l5 = new Label(" Nombre 421 : 0");

        Button boutonQuit = new Button("");
        Image imgQuit = new Image("ressources/petitMan.png",48,48,true,true);
        ImageView icon = new ImageView(imgQuit);
        boutonQuit.setGraphic(icon);
        boutonQuit.setOnAction(new EcouteurQuit());
        boutonJouer.setOnAction(new Ecouteur(l1,l2,l3,l4,l5));

        HBox boiteMid = new HBox(l1,l2,l3);
        HBox boiteHaut = new HBox(l4,l5);
        boiteMid.setAlignment(Pos.CENTER);
        boiteHaut.setAlignment(Pos.TOP_CENTER);

        root.setCenter(boiteMid);
        root.setTop(boiteHaut);
        root.setLeft(boutonQuit);
    }


    public static void main(String[] args) {
        launch(args);
    }
}