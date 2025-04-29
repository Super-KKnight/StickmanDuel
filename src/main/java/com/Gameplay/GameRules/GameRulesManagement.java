package com.Gameplay.GameRules;

import com.Gameplay.GameRules.Impl.roundTimeRules;

import java.util.ArrayList;

//需要在游戏开始时注册并加入循环更新
public class GameRulesManagement {

    public ArrayList<ParentGameRules> gameRules = new ArrayList<ParentGameRules>();
    public GameRulesManagement() {
        gameRules.add(new roundTimeRules(90));
    }
    public GameRules getGameRulesByName(String gameruleName) {
        for (ParentGameRules gameRule : gameRules) {
            if (gameRule.getGameRulesName().equals(gameruleName)){
                return gameRule;
            }
        }
        return null;
    }
    public void updateGameRules(Object o1, Object o2) {
        for (ParentGameRules gameRule : gameRules) {
            gameRule.JudgeVictor(o1,o2);
        }
    }
}
