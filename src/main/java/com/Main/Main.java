package com.Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("这是一个病毒软件，请扫码支付50元删除病毒");
        BorderPane root = new BorderPane(label);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My JavaFX Application");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
