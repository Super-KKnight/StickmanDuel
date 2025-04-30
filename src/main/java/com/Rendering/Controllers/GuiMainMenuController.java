package com.Rendering.Controllers;

import com.core.Window.Main.Game;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class GuiMainMenuController {
    @FXML
    public ImageView GameStart;

    @FXML
    public void mouseStartGame(MouseEvent mouseEvent) {
        System.out.println("startGameLoop!");
        Game.getInstance().RunGameLoop();
    }
    @FXML
    public void mouseEnteredGame(MouseEvent mouseEvent) {
    }
    @FXML
    public void mouseExitedGame(MouseEvent mouseEvent) {

    }
}
