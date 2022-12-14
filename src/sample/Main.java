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

        Image imgD1 = new Image("ressources/dice_1.png",60,60,true,true);
        ImageView d1 = new ImageView(imgD1);
        Button bout1 = new Button();
        bout1.setGraphic(d1);

        Image imgD2 = new Image("ressources/dice_1.png",60,60,true,true);
        ImageView d2 = new ImageView(imgD2);
        Button bout2 = new Button();
        bout2.setGraphic(d2);

        Image imgD3 = new Image("ressources/dice_1.png",60,60,true,true);
        ImageView d3 = new ImageView(imgD3);
        Button bout3 = new Button();
        bout3.setGraphic(d3);

        Label l4 = new Label("Nb press bouton : 0  /");

        Label l5 = new Label(" Nombre 421 : 0");

        Button boutonQuit = new Button("");
        Image imgQuit = new Image("ressources/petitMan.png",48,48,true,true);
        ImageView icon = new ImageView(imgQuit);
        boutonQuit.setGraphic(icon);
        boutonQuit.setOnAction(new EcouteurQuit());
        boutonJouer.setOnAction(new Ecouteur(bout1,bout2,bout3,l4,l5));

        HBox boiteMid = new HBox(bout1,bout2,bout3);
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