package gameplay.combat.Attack;

//所有攻击的父攻击类，用于定义攻击类型，伤害系数，被所有攻击子类继承
public class ParentAttack implements Attack{
    private double damage=1.0;
    private AttackType attackType;
    @Override
    public Double attack() {
        System.out.println("这是一个攻击");
        return 0.0;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
    //该父类中的攻击类型设置，适用于所有继承类
    public void  setAttackType(AttackType attackType){
        this.attackType= attackType;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    //以内部类枚举的形式定义变量
    protected enum AttackType{
        Light,Middle,Heavy;
    }


}
