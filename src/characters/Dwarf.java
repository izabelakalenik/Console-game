package characters;

import armours.MetalArmour;
import menu.Character;
import weapons.Axe;

public class Dwarf extends Character {

    public Dwarf(String n){
        super(n);
        weaponUsage = new Axe();
        armourUsage = new MetalArmour();
    }
}
