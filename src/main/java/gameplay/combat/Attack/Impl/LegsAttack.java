package gameplay.combat.Attack.Impl;

import gameplay.combat.Attack.Attack;
import gameplay.combat.Attack.DamageManagement.DamageManagement;
import gameplay.combat.Attack.ParentAttack;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class LegsAttack extends ParentAttack {

    @Override
    public Double attack() {
        setAttackDamage();
        System.out.println("这是一个" + getAttackType() + "的腿脚攻击伤害为" + getDamage());
       return DamageManagement.caculate(getDamage());
    }

    private void setAttackDamage() {
        switch (getAttackType()) {
            case Light -> setDamage(1.2);
            case Middle -> setDamage(1.3);
            case Heavy -> setDamage(1.4);
        }
    }
}
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParentAttack attacker = new LegsAttack();
        for (int i=0;i<10;i++){
            String s = scanner.nextLine();
            switch (s){
                case "j": attacker.setAttackType(AttackType.Light);
                break;
                case "k":  attacker.setAttackType(AttackType.Middle);
                break;
                case "l": attacker.setAttackType(AttackType.Heavy);
                break;
            }
            attacker.attack();
        }
    }
}
*/