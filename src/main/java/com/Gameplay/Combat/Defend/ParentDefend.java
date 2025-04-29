package com.Gameplay.Combat.Defend;

public class ParentDefend implements Defend{
    @Override
    public double defend(boolean isBlocking,double damage,double energy) {
        System.out.println("这是一次防御");
        return 0;

    }
}
