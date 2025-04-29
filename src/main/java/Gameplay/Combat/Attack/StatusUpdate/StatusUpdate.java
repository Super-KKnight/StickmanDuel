package Gameplay.Combat.Attack.StatusUpdate;

public class StatusUpdate {
    private static double Healthy=100;
    public static Double Calculate(double damage){
      return getHealthy()-damage;
    }

    public static double getHealthy() {
        return Healthy;
    }
}
