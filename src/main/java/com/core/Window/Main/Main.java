package com.core.Window.Main;

import com.Gameplay.Combat.Attack.AttackType;

import com.Gameplay.Combat.CombatManagement.CombatManageMent;
import com.Gameplay.Combat.TestFighter.ParentFighter;
import com.Gameplay.Combat.TestFighter.impl.DJFriter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root,1080,780);
        stage.setWidth(1080);
        stage.setHeight(780);
        //root.getChildren().add();
       stage.setScene(scene);

        stage.show();
    }
}
