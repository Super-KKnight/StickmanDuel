package com.Gameplay.Combat.TestFighter;


import com.Gameplay.Combat.Attack.AttackType;

public class ParentFighter {
    private double Health;
    private double Energy;
    private AttackType attackType;
    private boolean isblocking=false;

    public boolean isIsblocking() {
        return isblocking;
    }

    public void setIsblocking(boolean isblocking) {
        this.isblocking = isblocking;
    }

    public void setEnergy(double energy) {
        Energy = energy;
    }

    public void setHealth(double health) {
        Health = health;
    }

    public void FighterAttack(){


    }
    public void setAttackType(AttackType attackType)
    {
        this.attackType= attackType;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public double getEnergy() {
        return Energy;
    }

    public double getHealth() {
        return Health;
    }
    public ParentFighter(double Heal,double energy){
        this.Energy =energy;
        this.Health = Heal;
    }
}
