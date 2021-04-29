package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> units = new ArrayList<>();

    public int getArmySize() {
        return units.size();
    }

    public void addUnit(MilitaryUnit unit) {
        units.add(unit);
    }

    public int getArmyDamage() {
        int sum = 0;
        for (MilitaryUnit item : units) {
            sum += item.doDamage();
        }
        return sum;
    }

    public void damageAll(int i) {
        List<MilitaryUnit> remove = new ArrayList<>();
        for (MilitaryUnit item : units) {
            item.sufferDamage(i);
            if (item.getHitPoints() < 25) {
                remove.add(item);
            }
        }
        units.removeAll(remove);
    }
}
