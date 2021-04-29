package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private boolean pajzs = true;

    public Swordsman(boolean armor) {
        super(100, 10);
        super.setArmor(armor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (pajzs) {
            pajzs = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
