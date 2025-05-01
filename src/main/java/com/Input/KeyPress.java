package com.Input;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class KeyPress implements EventHandler<KeyEvent> {
    public static Set<KeyCode> pressed = Collections.newSetFromMap(new ConcurrentHashMap<>());
    @Override
    public void handle(KeyEvent keyEvent) {
        KeyCode code = keyEvent.getCode();
        if (code == KeyCode.J) {
            pressed.add(code);
            keyEvent.consume();
        }
        if (code == KeyCode.K) {
            pressed.add(code);
            keyEvent.consume();
        }
        if (code == KeyCode.L) {
            pressed.add(code);
            keyEvent.consume();
        }
        if (code == KeyCode.V) {
            pressed.add(code);
            keyEvent.consume();
        }
        if (code == KeyCode.D) {
            pressed.add(code);
            keyEvent.consume();
        }
        if (code == KeyCode.A) {
            pressed.add(code);
            keyEvent.consume();
        }
    }

    public static Set<KeyCode> getPressed() {
        return pressed;
    }
}
