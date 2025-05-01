package com.Gameplay.Combat.CombatManagement;




//战斗系统管理，统一管理所有模块


import com.Gameplay.Combat.Attack.AttackType;
import com.Gameplay.Combat.Attack.Impl.FistAttack;
import com.Gameplay.Combat.Attack.Impl.LegsAttack;
import com.Gameplay.Combat.Attack.ParentAttack;
import com.Gameplay.Combat.Defend.Impl.NormalDefend;
import com.Gameplay.Combat.Defend.ParentDefend;
import com.Gameplay.Combat.TestFighter.ParentFighter;
import org.junit.jupiter.api.Test;

//战斗系统管理，统一管理所有模块
public class CombatManageMent {

    ParentAttack FistAttack = new FistAttack();
    ParentAttack LegsAttack = new LegsAttack();
    ParentDefend NormalDefend = new NormalDefend();




    public void FistCombat(ParentFighter P1, ParentFighter P2){
        if (P1.getAttackType()!=null) {
            FistAttack.setAttackType(P1.getAttackType());
        }

        if(P2.isIsblocking()) {
            UpdateEnergy(NormalDefend.defend(P2.isIsblocking(), FistAttack.getDamage(), P2.getEnergy()),P2);
        }else{
            UpdateHealthy(FistAttack.attack(),P2);
        }



    }
    public void LegsCombat(ParentFighter P1, ParentFighter P2){
        if (P1.getAttackType()!=null) {
            LegsAttack.setAttackType(P1.getAttackType());
        }

        if(P2.isIsblocking()) {
            UpdateEnergy(NormalDefend.defend(P2.isIsblocking(), LegsAttack.getDamage(), P2.getEnergy()),P2);
        }else{
            UpdateHealthy(LegsAttack.attack(),P2);
        }
    }

//    public static Double Calculate(double damage){
//        return getHealthy()-damage;
//    }
//    public static double getHealthy() {
//        return Healthy;
//    }
//    public static double getEnergy(){return Energy;}

    @Test
    public void test(){
        ParentFighter DJ1 = new ParentFighter(100,100);
        ParentFighter DJ2 = new ParentFighter(100,100);
        DJ1.setAttackType(AttackType.Light);
        FistCombat(DJ1,DJ2);
        LegsCombat(DJ1,DJ2);

    }
    public void UpdateEnergy(double energy,ParentFighter p2){
        p2.setEnergy(energy);
        System.out.println("执行更新精力模块"+p2.getEnergy());
    }

    public void UpdateHealthy(double damage,ParentFighter p2){
        p2.setHealth(p2.getHealth()-damage);
        System.out.println("执行更新血量模块"+p2.getHealth());


    }


    }


