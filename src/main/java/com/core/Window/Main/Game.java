package com.core.Window.Main;

import com.Input.KeyPress;

import com.Input.KeyRelease;
import com.Rendering.Renderer;

import com.Stage.GameStageManagement;
import com.Utils.Timer;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;


import java.util.Objects;


public class Game extends Application {
    private Image image;
    private Rectangle2D rectangle;
    private static Stage stage;
    private final int width = 1080;
    private final int height = 900;
    private GameStageManagement gameStageManagement;
    private static final Game GameInstance = new Game();
    private static Pane rootPane;
    private static Scene scene;
    private Renderer renderer;
    private Timer timer = new Timer(20);
    //注册键盘监听 简易版
    private static KeyPress KeyPress;
    private static KeyRelease KeyRelease;
    //测试用例
    private Circle circle;
    private double xPosition, yPosition = 10;
    private double prevXPosition, prevYPositio;
    private long time;


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
        KeyPress = new KeyPress();
        KeyRelease = new KeyRelease();
        Screen screen = Screen.getPrimary();
        rectangle = screen.getVisualBounds();
        String iconPath = "/icon.png";
        image = new Image(Objects.requireNonNull(
                Game.class.getResourceAsStream(iconPath),
                "Resource not found: " + iconPath
        ));
        circle = new Circle(10, 10, 5);
        rootPane = new Pane();
        rootPane.getChildren().add(circle);
        scene = new Scene(rootPane, width, height);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        // 设置标题和图标
        stage.setTitle("StickManDuel");
        //primaryStage.getIcons().add(image);
        stage.setWidth(width);
        stage.setHeight(height);


        //设置加载初始场景
        stage.setScene(scene);
        //renderer.GuiMainMenuRender();
        //注册键盘监听
        scene.setOnKeyPressed(KeyPress);
        scene.setOnKeyReleased(KeyRelease);
        time = System.currentTimeMillis();
        new AnimationTimer() {
            @Override
            public void handle(long l) {
                RunGameLoop();
            }
        }.start();

        primaryStage.show();
    }

    @Override
    public void stop() {
        System.exit(0);
    }


    //游戏更新部分
    private void RunGameLoop() {
        timer.updateTimer();
        for (int j = 0; j < timer.elapsedTicks; j++) {
            RunTick();
        }
        updateRender(timer.renderPartialTicks);

    }

    private void RunTick() {
        prevXPosition = xPosition;
        prevYPositio = yPosition;

        if (KeyPress.pressed.contains(KeyCode.D)) {
            xPosition+=10;
        }if (KeyPress.pressed.contains(KeyCode.A)) {
            xPosition-=10;
        }

    }

    private void updateRender(float partialTicks) {
        double dx = prevXPosition + (xPosition - prevXPosition) * partialTicks;
        circle.setCenterX(dx);
        double dy = prevYPositio + (yPosition - prevYPositio) * partialTicks;
        circle.setCenterY(dy);
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

    public static long getSystemTime() {
        return System.nanoTime() / 1000000L;
    }

    public static Pane getRoot() {
        return rootPane;
    }


}