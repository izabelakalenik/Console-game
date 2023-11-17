package characters;

import armours.ForestArmour;
import menu.Character;
import weapons.Bow;

public class Elf extends Character {

    public Elf(String n){
        super(n);
        weaponUsage = new Bow();
        armourUsage = new ForestArmour();
    }
}
