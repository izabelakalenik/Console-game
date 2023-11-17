package characters;

import armours.EnchantedArmour;
import menu.Character;
import weapons.Sword;

public class Tiefling extends Character {

    public Tiefling(String n){
        super(n);
        weaponUsage = new Sword();
        armourUsage = new EnchantedArmour();
    }
}
