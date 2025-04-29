package com.Gameplay.Combat.Defend.Impl;

import com.Gameplay.Combat.Defend.ParentDefend;

public class NormalDefend extends ParentDefend {
    private double Energy;

    @Override
    public double defend(boolean isBlocking, double damage, double energy){
        isDefend(isBlocking,damage,energy);
        return Energy;

    }

    private void EnergyCalculate(double damage,double energy){
        Energy = energy-(damage*0.7);

    }
    //格挡判定
    public void isDefend(boolean isBlocking,double damage,double energy){
        if (isBlocking){
            EnergyCalculate(damage,energy);
        }
    }
}
