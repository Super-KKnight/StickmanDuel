package com.Input;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyRelease  implements EventHandler<KeyEvent> {
    @Override
    public void handle(KeyEvent keyEvent) {
        KeyCode code = keyEvent.getCode();
        if (KeyPress.pressed.contains(code)) {
            KeyPress.pressed.remove(code);
            keyEvent.consume(); // 消费事件
        }
    }

}
