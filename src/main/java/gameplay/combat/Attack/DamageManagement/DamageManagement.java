package gameplay.combat.Attack.DamageManagement;

public class DamageManagement {
    private static double healty=100;
    public static Double caculate(double damage){
      return getHealty()-damage;
    }

    public static double getHealty() {
        return healty;
    }
}
