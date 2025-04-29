package com.Gameplay.GameRules.Impl;

import com.Gameplay.GameRules.ParentGameRules;

public class roundTimeRules extends ParentGameRules {
    /*
    1.游戏时间
        1.1 固定时间为60s
        1.2 自定义时间为 ts
    2. 如何计时? 当检测到对局开始时调用:TimeRules ->record current Time -> calculate time(isRunOut?) -> Judge the victor
    3.时间系统:ms
     */
    private final int settingTime;
    private final long startTime = System.currentTimeMillis();

    public roundTimeRules(int settingTime) {
        super("roundTimeRules");
        this.settingTime = settingTime;
    }
    //内部判断逻辑,用于检测是否超时
    private boolean calculateTime(){
        return System.currentTimeMillis() - startTime >= settingTime;
    }

    public Boolean JudgeTheTimeOutVictor(Object o1, Object o2){
        boolean TimeOut = calculateTime();
        if (TimeOut){
            return true;
        }
        return false;
    }
    @Override
    public boolean JudgeVictor(Object o1, Object o2){
        return JudgeTheTimeOutVictor(o1, o2);
    }


}
