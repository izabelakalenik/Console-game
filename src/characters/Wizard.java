package characters;

import armours.EnchantedArmour;
import menu.Character;
import weapons.Spellcasting;

public class Wizard extends Character {

    public Wizard(String n){
        super(n);
        weaponUsage = new Spellcasting();
        armourUsage = new EnchantedArmour();
    }
}
