package com.core.Window.Main;

import com.Gameplay.Combat.Attack.AttackType;

import com.Gameplay.Combat.CombatManagement.CombatManageMent;
import com.Gameplay.Combat.TestFighter.ParentFighter;
import com.Gameplay.Combat.TestFighter.impl.DJFriter;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import java.util.Scanner;

public class Main extends Application {
    Rectangle rec = new Rectangle(10,10);
    private double previousx;
    private double x;
    private long  currentLuoji;
    private long time;
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root,1080,780);
        stage.setWidth(1080);
        stage.setHeight(780);
        root.getChildren().add(rec);
        stage.setScene(scene);
        time = System.currentTimeMillis();

        new AnimationTimer(){
            @Override
            public void handle(long currentRenderMills) {

                logicUpdate();
                renderUpdate();

            }
        }.start();

        stage.show();
    }
    private void logicUpdate(){

        if (System.currentTimeMillis()-currentLuoji>50){
            previousx = x;
            x = x + 40;
            if(x>1080){
                System.out.println((System.currentTimeMillis()-time)/1000D);
                x=0;

            }
            currentLuoji = System.currentTimeMillis();
        }
    }
    private void renderUpdate(){
        double detla2 = (double) (System.currentTimeMillis() - currentLuoji);
        double p = detla2 / (50);


        double px = previousx + (x - previousx) * p;

        rec.setX(px);
    }
}
