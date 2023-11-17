package characters;

import armours.FlowerArmour;
import menu.Character;
import weapons.Poison;

public class Queen extends Character {

    public Queen(String n){
        super(n);
        weaponUsage = new Poison();
        armourUsage = new FlowerArmour();
    }
}
