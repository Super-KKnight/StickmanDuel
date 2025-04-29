package Gameplay.GameRules;

public class ParentGameRules implements GameRules {
    private String GameRules;
    public ParentGameRules(String GameRules) {
        this.GameRules = GameRules;
    }
    @Override
    public boolean JudgeVictor(Object o1, Object o2) {
        return false;
    }

    public String getGameRulesName() {
        return GameRules;
    }
}
