package com.Rendering;

import com.Rendering.GameMainMenu.GameMainMenu;

public class Renderer {
    public GameMainMenu gameMainMenu;
    public Renderer() {
        gameMainMenu = new GameMainMenu();
    }
    public void GuiMainMenuRender(){
        gameMainMenu.loadMainMenu();
    }
}
