package com.test;



public class test {
    private final static double version = 0.1;

    public static void main(String[] args) {
        installGame();
        gameName();
        updateVersion();
        downVersion();
    }

    public static void installGame() {
        System.out.println("下载火柴人激斗！"+version);
    }

    public static void gameName() {
        System.out.println("火柴人激斗");
    }

    public static void updateVersion() {
        System.out.println("版本更新");
    }

    public static void downVersion() {
        System.out.println("版本降级");
    }
}
