package menu;

import armours.ArmourUsage;
import weapons.WeaponUsage;

public abstract class Character {

    protected WeaponUsage weaponUsage;
    protected ArmourUsage armourUsage;

    String n;

    public Character(String n) {
        this.n = n;
    }


    public String getN() {
        return n;
    }

    public void doArmourUsage() {
        armourUsage.wearArmour();
    }

    public void setArmourUsage(ArmourUsage a) {
        this.armourUsage = a;
    }

    public void doWeaponUsage() {
        weaponUsage.weaponShowcase();

    }

    public void setWeaponUsage(WeaponUsage w) {
        this.weaponUsage = w;

    }

    public void goForward(int s) {

        if (s == 1) {
            System.out.println("Tup, tup, tup... 1 step forward");
        } else {
            System.out.println("Tup, tup, tup... " + s + " steps forward");
        }

    }

    public boolean equals(Object other) {
        if (other instanceof Character) {
            Character ch = (Character) other;
            if (this.n == ch.n) {
                return true;
            }
        }

        return false;
    }
}
