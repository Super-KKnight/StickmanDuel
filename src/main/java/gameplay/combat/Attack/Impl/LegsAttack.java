package gameplay.combat.Attack.Impl;

import gameplay.combat.Attack.Attack;
import gameplay.combat.Attack.ParentAttack;
import org.junit.jupiter.api.Test;

public class LegsAttack extends ParentAttack {

    @Override
    public void attack() {
        setAttackDamage();
        System.out.println("这是一个" + getAttackType() + "的腿脚攻击伤害为" + getDamage());
    }

    private void setAttackDamage() {
        switch (getAttackType()) {
            case Light -> setDamage(1.2);
            case Middle -> setDamage(1.3);
            case Heavy -> setDamage(1.4);
        }


    }

    @Test
    public void Test() {
        this.setAttackType(AttackType.Light);
        attack();
    }
}
