package com.Gameplay.Combat.Attack.Impl;


import com.Gameplay.Combat.Attack.ParentAttack;


public class FistAttack extends ParentAttack {
    @Override
    //攻击显示，attack中执行的是最终攻击判定
    public double attack() {

        System.out.printf("这是一次"+getAttackType()+"的拳头攻击"+"伤害为"+getDamage());
        return
    }



    //对每一个攻击类型进行伤害设置
    public void setAttackDamage(){
        switch (getAttackType()){
            case Light -> setDamage(10.5);
            case Middle -> setDamage(1.6);
            case Heavy -> setDamage(1.7);
        }
    }
}
/*
    private void isBlocking(NormalDefend defend,boolean Blocking,double damage,double energy){
        if (Blocking){
            defend.isDefend(Blocking,damage,energy);
            setDamage(0);
        }
    }

}

 */
