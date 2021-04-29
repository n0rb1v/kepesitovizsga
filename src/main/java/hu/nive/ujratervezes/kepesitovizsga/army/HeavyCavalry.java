package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean firstAttack = true;

    public HeavyCavalry() {
        super(150, 20);
        super.setArmor(true);
    }

    @Override
    public int doDamage() {
        if (firstAttack) {
            firstAttack = false;
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }
}
