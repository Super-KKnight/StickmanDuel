package impl;


import com.Gameplay.Combat.TestFighter.ParentFighter;

import java.util.concurrent.atomic.AtomicLong;

public class Dj extends ParentPerson {
    public static long currentLuoji = System.currentTimeMillis();
    public static long previousLuoji = 0;
    public static int x = 0;
    public static double speed = 0.5;
    public static int previousx;

    public Dj(String name, Double Healthy) {
        super(name, Healthy);
    }


        public static long lastLogicTime = System.currentTimeMillis();  // 上次逻辑帧更新时间
        public static long lastRenderTime = System.currentTimeMillis(); // 上次渲染帧更新时间
        public static int x_logic = 0;  // 当前逻辑帧的物体位置
        public static int x_previous_logic = 0;  // 上一逻辑帧的物体位置
        public static double timeStep = 50;  // 假设每个逻辑帧的时间间隔为16.67ms，即60 FPS
        public static double x_render = 0;  // 渲染时的物体位置

        public static void main(String[] args) throws InterruptedException {
            // 模拟逻辑更新线程
            Thread logicThread = new Thread(() -> {
                while (true) {
                    long currentLogicTime = System.currentTimeMillis();
                    // 每次逻辑更新物体位置
                    x_previous_logic = x_logic;
                    System.out.println("After Logic updated: x_logic = " + x_logic);
                    x_logic += 1;  // 假设每个逻辑帧物体移动1单位

                    lastLogicTime = currentLogicTime;
//                    System.out.println("After Logic updated: x_logic = " + x_logic);

                    try {
                        Thread.sleep(50);  // 16ms模拟每帧更新（60 FPS）
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // 模拟渲染更新线程
            Thread renderThread = new Thread(() -> {
                while (true) {
                    long currentRenderTime = System.currentTimeMillis();
                    long deltaTime = currentRenderTime - lastLogicTime;  // 渲染帧与上一逻辑帧的时间差

                    // 计算插值位置
                    double interpolationFactor = (double) deltaTime / timeStep;
                    x_render = x_previous_logic + (x_logic - x_previous_logic) * interpolationFactor;

                    // 打印插值后的渲染位置
                    System.out.println("Render updated: x_render = " + x_render);

                    lastRenderTime = currentRenderTime;
                    try {
                        Thread.sleep(10);  // 假设渲染帧率为100 FPS
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            logicThread.start();
            renderThread.start();
        }
    }

