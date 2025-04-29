package Gameplay.Combat.DamageManagement;

//伤害管理系统，用于计算并返回血量,精力
public class DamageManagement {
    private static double Health=100;

    public static Double caculate(double damage){
      return getHealth()-damage;
    }

    public static double getHealth() {
        return Health;
    }

}
