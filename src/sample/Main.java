package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
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
        Label l1 = new Label("1");
        Label l2 = new Label("1");
        Label l3 = new Label("1");
        boutonJouer.setOnAction(new Ecouteur(l1,l2,l3));
        HBox boite = new HBox(l1,l2,l3);
        boite.setAlignment(Pos.CENTER);
        root.setCenter(boite);
    }


    public static void main(String[] args) {
        launch(args);
    }
}