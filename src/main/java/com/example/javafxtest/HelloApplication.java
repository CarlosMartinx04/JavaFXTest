package com.example.javafxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TabPane tabMother = new TabPane();

        Pane pane = new Pane();
        Button buttonPane = new Button("Absoluto");
        buttonPane.setLayoutX(50);buttonPane.setLayoutY(50);
        pane.getChildren().add(buttonPane);//Añadimos el Boton.
        Tab tabPane = new Tab("Pane");
        tabPane.setContent(pane);//Añado el Pane al contenido del TabPane.
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        StackPane stackPane = new StackPane();
        Button buttonStackPane = new Button("Centrado");
        stackPane.getChildren().add(buttonStackPane);
        Tab tabStackPane = new Tab("StackPane");
        tabStackPane.setContent(stackPane);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        HBox hBox = new HBox();
        Button A = new Button("A");
        Button B = new Button("B");
        Button C = new Button("C");


        tabMother.getTabs().addAll(tabPane, tabStackPane);//Añado el TabPane al TabMother para que forme parte de el.
        Scene scene = new Scene(tabMother, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
