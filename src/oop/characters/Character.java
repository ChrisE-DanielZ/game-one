package oop.characters;

public abstract class Character implements Attackable, Defendable{

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int defenseLevel = 0;
    protected int spAttackDamage = 0;
    protected int spDefenseLevel = 0;

    public Character(int hp, int attackDamage, int defenseLevel, int spAttackDamage, int spDefenseLevel) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defenseLevel = defenseLevel;
        this.spAttackDamage = spAttackDamage;
        this.spDefenseLevel = spDefenseLevel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

    @Override
    public void defense() {
        if (attackDamage > defenseLevel){
            System.out.println("Attacked for " + (attackDamage - defenseLevel) + " damage");
        }else {
            System.out.println("Attacked for 0 damage");
        }
    }
}
