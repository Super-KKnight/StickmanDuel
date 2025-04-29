package com.core.Window.GameMainMenu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GameMainMenu {
    public static void loadMainMenu(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(GameMainMenu.class.getResource("/Fxml/GameMainMenu.fxml")));
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
