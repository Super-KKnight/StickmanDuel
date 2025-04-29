package com.core.Window.Main;

import com.core.Window.GameMainMenu.GameMainMenu;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Objects;

public class Game extends Application {
    private Image image;
    private Rectangle2D rectangle;


    @Override
    public void init() throws Exception {
        Screen screen = Screen.getPrimary();
        rectangle = screen.getVisualBounds();
        String iconPath = "/icon.png";
        image = new Image(Objects.requireNonNull(
                Game.class.getResourceAsStream(iconPath),
                "Resource not found: " + iconPath
        ));
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 500, 800);
        // 设置标题和图标
        primaryStage.setTitle("StickManDuel");
        primaryStage.getIcons().add(image);
        primaryStage.setWidth(800);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        GameMainMenu.loadMainMenu(primaryStage);

        primaryStage.show();

    }
}