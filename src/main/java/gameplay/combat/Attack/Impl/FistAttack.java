package gameplay.combat.Attack.Impl;

import gameplay.combat.DamageManagement.DamageManagement;
import gameplay.combat.Attack.ParentAttack;

//拳攻击类
public class FistAttack extends ParentAttack {
    @Override
    //攻击显示，attack中执行的是最终攻击判定
    public Double attack() {
        setAttackDamage();
        System.out.printf("这是一次"+getAttackType()+"的拳头攻击"+"伤害为"+getDamage());System.out.println("剩余血量:"+DamageManagement.caculate(getDamage()));
        return DamageManagement.caculate(getDamage());
    }


    //对每一个攻击类型进行伤害设置
    private void setAttackDamage(){
        switch (getAttackType()){
            case Light -> setDamage(1.5);
            case Middle -> setDamage(1.6);
            case Heavy -> setDamage(1.7);
        }
    }

}
