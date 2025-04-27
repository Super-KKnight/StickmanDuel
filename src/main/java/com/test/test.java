package com.test;

import com.example.example;

public class test {
    public static void main(String[] args) {
        gameName();
        example.sayHello();
        downVersion();
        updateVersion();
        gameUninstalls();
    }
    public static void installGame(){
        System.out.println("installGame！");
    }
    public static void gameName() {
        System.out.println("火柴人激斗");
    }
    public static void updateVersion(){
        System.out.println("版本更新");
    }
    public static void downVersion(){
        System.out.println("版本降级");
    }
    public static void gameUninstalls(){
        System.out.println("应用已卸载");
    }
}
