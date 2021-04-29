package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private int damage;
    private boolean armor;

    public MilitaryUnit(int hitPoints, int damage) {
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if (armor) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }
}
