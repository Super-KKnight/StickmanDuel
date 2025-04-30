package com.Input;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class KeyProcess implements EventHandler<KeyEvent> {
   public static Set<KeyCode> pressed = Collections.newSetFromMap(new ConcurrentHashMap<>());
    @Override
    public void handle(KeyEvent keyEvent) {
        KeyCode code = keyEvent.getCode();
        if (code == KeyCode.J) {
            System.out.println("J pressed!");
            pressed.add(code);
        }
        if (code == KeyCode.K) {
            System.out.println("K pressed!");
            pressed.add(code);
        }
        if (code == KeyCode.L) {
            System.out.println("L pressed!");
            pressed.add(code);
        }
    }

}
