package com.Gameplay.Combat.CombatManagement;

import com.Gameplay.Combat.Attack.Impl.FistAttack;
import com.Gameplay.Combat.Attack.Impl.LegsAttack;
import com.Gameplay.Combat.Attack.ParentAttack;

import com.Gameplay.Combat.Defend.Impl.NormalDefend;
import com.Gameplay.Combat.Defend.ParentDefend;


//战斗系统管理，统一管理所有模块
public class CombatManagement {
    ParentAttack FistAttack = new FistAttack();
    ParentAttack LegsAttack = new LegsAttack();
    ParentDefend NormalDefend = new NormalDefend();

    public void FistCombat(){
        FistAttack.setAttackType(ParentAttack.AttackType.Light);
        Boolean isBlocking = true;
        if(isBlocking) {
            System.out.println(FistAttack.getDamage());
            System.out.println(NormalDefend.defend(isBlocking, FistAttack.getDamage(), 100));
        }else if (FistAttack.getAttackType()!=null){
            FistAttack.attack();
        }
    }

}

