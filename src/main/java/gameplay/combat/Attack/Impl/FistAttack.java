package gameplay.combat.Attack.Impl;

import gameplay.combat.Attack.Attack;
import gameplay.combat.Attack.ParentAttack;
import org.junit.jupiter.api.Test;

public class FistAttack extends ParentAttack {
    @Override
    //攻击显示，attack中执行的是最终攻击判定
    public void attack() {
        setAttackDamage();
        System.out.printf("这是一次"+getAttackType()+"的拳头攻击"+"伤害为"+getDamage());
    }


    //对每一个攻击类型进行伤害设置
    private void setAttackDamage(){
        switch (getAttackType()){
            case Light -> setDamage(1.5);
            case Middle -> setDamage(1.6);
            case Heavy -> setDamage(1.7);
        }
    }
    @Test
    public void Test(){
        this.setAttackType(AttackType.Light);
        attack();
    }
}
