package com.Gameplay.Combat.TestFighter;

public class ParentFighter {
    private double Health;
    private double Energy;
    private AttackType attackType;

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
