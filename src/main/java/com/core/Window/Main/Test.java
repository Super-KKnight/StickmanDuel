package com.core.Window.Main;

import com.Utils.Timer;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Test extends Application {
    private Circle circle;
    private Timer timer = new Timer(20);
    private double xPosition, yPosition = 10;
    private double prevXPosition, prevYPositio;
    private static Pane root;
    public static Scene scene;
    private final int width = 1200;
    private final int height = 900;

    @Override
    public void init() throws Exception {
        root = new Pane();
        circle = new Circle(10, 10, 5);
        root.getChildren().add(circle);
        scene = new Scene(root, width, 600);
    }
    @Override
    public void start(Stage primaryStage) {


        // 逻辑更新线程
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                RunGameLoop();
            }
        }.start();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void updateLogic() {
        // 这里添加逻辑更新代码
        prevXPosition=xPosition;
        prevYPositio=yPosition;
        xPosition+=1;
        if (xPosition>width) {
            xPosition=0;
        }
    }
    private void drawCircle(float partialTicks) {
        double dx = prevXPosition+(xPosition-prevXPosition)*partialTicks;
        circle.setCenterX(dx);
        double dy =  prevYPositio + (yPosition - prevYPositio) * partialTicks;
        circle.setCenterY(dy);
    }
    private void RunGameLoop(){
        timer.updateTimer();
        for (int j=0; j< timer.elapsedTicks; j++) {
            updateLogic();
        }
        drawCircle(timer.renderPartialTicks);
    }


}
