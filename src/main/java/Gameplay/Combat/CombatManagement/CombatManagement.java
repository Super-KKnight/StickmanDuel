package Gameplay.Combat.CombatManagement;

import Gameplay.Combat.Attack.Impl.FistAttack;
import Gameplay.Combat.Attack.Impl.LegsAttack;
import Gameplay.Combat.Attack.ParentAttack;

import Gameplay.Combat.Defend.Impl.NormalDefend;
import Gameplay.Combat.Defend.ParentDefend;
import org.junit.jupiter.api.Test;

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
    @Test
    public void LegsCombat(){
        LegsAttack.setAttackType(ParentAttack.AttackType.Light);
        Boolean isBlocking = true;
        if(isBlocking) {
            System.out.println(NormalDefend.defend(isBlocking, LegsAttack.getDamage(), 100));
        }else if (LegsAttack.getAttackType()!=null){
            LegsAttack.attack();
        }
    }
}

