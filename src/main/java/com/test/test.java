package com.test;

import com.example.example;

public class test {
    public static void main(String[] args) {
        gameName();
        example.sayHello();
        appUninstalls();
        updateVersion();
    }
    public static void gameName() {
        System.out.println("火柴人激斗");
    }
    public static void updateVersion(){
        System.out.println("版本更新");
    }
    public static void appUninstalls(){
        System.out.println("应用卸载");
    }
}
