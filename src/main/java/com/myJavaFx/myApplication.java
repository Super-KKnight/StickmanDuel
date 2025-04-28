package com.myJavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class myApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("这是一个病毒软件，请扫码支付50元删除病毒");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My JavaFX Application");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
