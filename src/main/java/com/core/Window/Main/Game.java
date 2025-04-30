package com.core.Window.Main;

import com.Input.KeyProcess;
import com.Rendering.Renderer;

import com.Stage.GameStageManagement;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;


import java.util.Objects;


public class Game extends Application {
    private Image image;
    private Rectangle2D rectangle;
    private static Stage stage;
    private static Scene scene;
    private static final Game GameInstance = new Game();
    private Renderer renderer;
    private final int width = 1200;
    private final int height = 900;
    private GameStageManagement gameStageManagement;
    //注册键盘监听 简易版
    private static KeyProcess keyProcess;
    private boolean gameRunning = false;


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void init() throws Exception {
        renderer = new Renderer();
        gameStageManagement = new GameStageManagement();
        keyProcess = new KeyProcess();
        Screen screen = Screen.getPrimary();
        rectangle = screen.getVisualBounds();
        String iconPath = "/icon.png";
        image = new Image(Objects.requireNonNull(
                Game.class.getResourceAsStream(iconPath),
                "Resource not found: " + iconPath
        ));
        Parent root = new AnchorPane();
        scene = new Scene(root, width, height);


    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        // 设置标题和图标
        stage.setTitle("StickManDuel");
        stage.getIcons().add(image);
        stage.setWidth(width);
        stage.setHeight(height);
        //设置加载初始场景
        stage.setScene(scene);
        renderer.GuiMainMenuRender();
        //开启键盘监听
        stage.show();
    }

    @Override
    public void stop() {
        System.exit(0);
    }

    //游戏逻辑更新部分 固定步长 要求每秒更新20次 按照毫秒计算
    public void RunGameLoop() {
        stage.getScene().setOnKeyPressed(keyProcess);
        if (!gameRunning) {
            final Thread t2 = new Thread(() -> {
                while (true) {
                    // --- 游戏逻辑更新阶段 --- 示例
                    if (KeyProcess.pressed.contains(KeyCode.J)) {
                        System.out.println("update keyPressed J");
                        KeyProcess.pressed.remove(KeyCode.J);
                    }
                    if (KeyProcess.pressed.contains(KeyCode.K)) {
                        System.out.println("update keyPressed K");
                        KeyProcess.pressed.remove(KeyCode.K);
                    }
                    if (KeyProcess.pressed.contains(KeyCode.L)) {
                        System.out.println("update keyPressed L");
                        KeyProcess.pressed.remove(KeyCode.L);
                    }
                    try {
                        Thread.sleep(50); // 控制更新频率 ~60FPS
                    } catch (InterruptedException ex) {
                        break;
                    }
                }
            });
            t2.setDaemon(true);
            t2.start();
            gameRunning = true;
        } else {
            System.out.println("Game is already running");
        }
    }


    public static Stage getStage() {
        return stage;
    }

    public static Scene getScene() {
        return scene;
    }

    public static Game getInstance() {
        return GameInstance;
    }


}