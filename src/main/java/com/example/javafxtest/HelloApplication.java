package com.example.javafxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.util.concurrent.Flow;

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
        stackPane.getChildren().add(buttonStackPane);//Coge a los hijos y los añade al Padre(StackPane)
        Tab tabStackPane = new Tab("StackPane");
        tabStackPane.setContent(stackPane);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        HBox hBox = new HBox();
        Button A = new Button("A");
        Button B = new Button("B");
        Button C = new Button("C");
        Tab tabHBox = new Tab("HBox");
        hBox.getChildren().addAll(A, B, C);//Coge a los hijos y los añade al Padre(HBox)
        tabHBox.setContent(hBox);
        hBox.setSpacing(10);//Añade espacios entre los contenidos del hbox
        hBox.setPadding(new Insets(20));//Añade espacio al marco del objeto(hbox)
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        VBox vBox = new VBox();
        Button buttonUno = new Button("Uno");
        Button buttonDos = new Button("Dos");
        Button buttonTres = new Button("Tres");
        Tab tabVBox = new Tab("VBox");
        vBox.getChildren().addAll(buttonUno, buttonDos, buttonTres);
        tabVBox.setContent(vBox);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BorderPane borderPane = new BorderPane();
        Tab tabBorderPane = new Tab("BorderPane");

        Label labelIzquierdaSup = new Label("Cabecera(TOP)");
        borderPane.setTop(labelIzquierdaSup);

        Button buttonIzquierda = new Button("Izquierda");
        borderPane.setLeft(buttonIzquierda);

        Button buttonDerecha = new Button("Derecha");
        borderPane.setRight(buttonDerecha);

        Label labelCentro = new Label("Centro");
        borderPane.setCenter(labelCentro);

        Label labelIzquierdaInf = new Label("Pie(BOTTOM)");
        borderPane.setBottom(labelIzquierdaInf);

        tabBorderPane.setContent(borderPane);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        GridPane gridPane = new GridPane();
        Tab tabGridPane = new Tab("GridPane");
        Label labelUsuario = new Label("Usuarios: ");
        gridPane.add(labelUsuario, 0,0);

        Label labelContraseña = new Label("Contraseña: ");
        gridPane.add(labelContraseña, 0,1);

        TextField textFieldUsuario = new TextField();
        gridPane.add(textFieldUsuario, 1,0);

        TextField textFieldContraseña = new TextField();
        gridPane.add(textFieldContraseña, 1,1);

        tabGridPane.setContent(gridPane);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        FlowPane flowPane = new FlowPane();
        Tab tabFlowPane = new Tab("Flow Pane");
        Button buttonOne = new Button("1");
        Button buttonTwo = new Button("2");
        Button buttonThree = new Button("3");
        Button buttonFour = new Button("4");
        Button buttonFive = new Button("5");
        Button buttonSix = new Button("6");
        flowPane.getChildren().addAll(buttonOne,buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix);
        tabFlowPane.setContent(flowPane);
        flowPane.setHgap(10);//Como el Spacing pero hay que añadirle hgap y vgap.
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        AnchorPane anchorPane = new AnchorPane();
        Tab tabAnchorPane = new Tab("AnchorPane");
        Button buttonAnchorPane = new Button("Anclado: ");
        anchorPane.getChildren().add(buttonAnchorPane);
        anchorPane.setRightAnchor(buttonAnchorPane, 10.0);

        tabAnchorPane.setContent(anchorPane);

        tabMother.getTabs().addAll(tabPane, tabStackPane, tabHBox, tabVBox, tabBorderPane, tabGridPane, tabFlowPane, tabAnchorPane);//Añado el TabPane al TabMother para que forme parte de el.
        Scene scene = new Scene(tabMother, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
