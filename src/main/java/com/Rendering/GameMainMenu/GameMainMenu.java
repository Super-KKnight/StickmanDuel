package com.Rendering.GameMainMenu;

import com.core.Window.Main.Game;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Objects;

public class GameMainMenu {
    public void loadMainMenu() {
        try {
            //节点
            Parent root = FXMLLoader.load(Objects.requireNonNull(GameMainMenu.class.getResource("/Fxml/GameMainMenu.fxml")));
            Game.getInstance().getScene().setRoot(root);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
