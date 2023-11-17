package characters;

import armours.KevlarArmour;
import menu.Character;
import weapons.Gun;

public class Ranger extends Character {

    public Ranger(String n){
        super(n);
        weaponUsage = new Gun();
        armourUsage = new KevlarArmour();
    }
}
