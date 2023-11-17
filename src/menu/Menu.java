package menu;

import armours.*;
import characters.*;
import weapons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Character> characters = new ArrayList<>();
    Character character;
    WeaponUsage w;
    ArmourUsage a;

    Scanner scannerString = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);
    int type;
    String name;
    int weaponType;
    int armourType;


    public void info1() {
        System.out.println("Enter the name of your character: ");
        name = scannerString.nextLine();
    }

    public void create() {
        do {
            System.out.println("Choose the class of your character: \n 1. Dwarf \n 2. Elf \n 3. Queen \n 4. Ranger \n 5. Tiefling \n 6. Wizard");
            type = scannerInt.nextInt();

            switch (type) {
                case 1:
                    character = new Dwarf(name);
                    characters.add(character);
                    break;
                case 2:
                    character = new Elf(name);
                    characters.add(character);
                    break;
                case 3:
                    character = new Queen(name);
                    characters.add(character);
                    break;
                case 4:
                    character = new Ranger(name);
                    characters.add(character);
                    break;
                case 5:
                    character = new Tiefling(name);
                    characters.add(character);
                    break;
                case 6:
                    character = new Wizard(name);
                    characters.add(character);
                    break;
                default:
                    System.out.println("This type of class is not available");
                    System.out.println();
                    break;
            }

        } while (!(type >= 1 && type <= 6));

    }

    public WeaponUsage selectWeapon() {
        do {
            System.out.println("Select a weapon you want to use in a fight or type '0' if you want to use default weapon: \n 1. Axe \n 2. Bow \n 3. Crossbow \n 4. Gun \n 5. Poison \n 6. Spear \n 7. Spellcasting \n 8. Sword");
            weaponType = scannerInt.nextInt();

            switch (weaponType) {
                case 1:
                    w = new Axe();
                    character.setWeaponUsage(w);
                    break;
                case 2:
                    w = new Bow();
                    character.setWeaponUsage(w);
                    break;
                case 3:
                    w = new Crossbow();
                    character.setWeaponUsage(w);
                    break;
                case 4:
                    w = new Gun();
                    character.setWeaponUsage(w);
                    break;
                case 5:
                    w = new Poison();
                    character.setWeaponUsage(w);
                    break;
                case 6:
                    w = new Spear();
                    character.setWeaponUsage(w);
                    break;
                case 7:
                    w = new Spellcasting();
                    character.setWeaponUsage(w);
                    break;
                case 8:
                    w = new Sword();
                    character.setWeaponUsage(w);
                    break;
                case 0:
                    w = character.weaponUsage;
                    break;
                default:
                    System.out.println("This type of weapon is not available");
                    System.out.println();
                    break;
            }

        } while (!(weaponType >= 0 && weaponType <= 8));


        return w;
    }

    public void mainMenu() {
        int number = 0;
        while (number != 4) {
            System.out.println("MAIN MENU");
            System.out.println("1. Create a character");
            System.out.println("2. Show a list of the characters");
            System.out.println("3. Take an action");
            System.out.println("4. Exit the game");
            number = scannerInt.nextInt();

            switch (number) {
                case 1:
                    info1();
                    create();
                    selectWeapon();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    action();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Choose another number");
                    System.out.println();
            }
        }
    }


    public void showList() {
        System.out.println("The list of created characters: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getN());
        }
    }


    public ArmourUsage changeArmour() {
        do {
            System.out.println("What armour do you want to choose? \n 1.Enchanted armour \n 2.Kevlar armour \n 3.Metal armour \n 4.Forest armour \n 5.Flower armour");
            armourType = scannerInt.nextInt();

            switch (armourType) {
                case 1:
                    a = new EnchantedArmour();
                    character.setArmourUsage(a);
                    break;
                case 2:
                    a = new KevlarArmour();
                    character.setArmourUsage(a);
                    break;
                case 3:
                    a = new MetalArmour();
                    character.setArmourUsage(a);
                    break;
                case 4:
                    a = new ForestArmour();
                    character.setArmourUsage(a);
                    break;
                case 5:
                    a = new FlowerArmour();
                    character.setArmourUsage(a);
                    break;
                default:
                    System.out.println("This type of armour is not available");
                    System.out.println();
                    break;
            }

        } while (!(armourType >= 1 && armourType <= 5));

        return a;
    }

    public void fight(Character ch1, Character ch2) {
        shoot(ch1, ch2);
        answer(ch1, ch2);
        System.out.println();
        System.out.println("This is the fight between " + ch1.getN() + " and " + ch2.getN());
        System.out.println("""

                                            ,--.                       ,--.
                                          _',|| )                     ( \\\\ |
                            ,.,,.,-----""' "--v-.___                   `_\\\\.'--,..__
                            |,"---.--''/       /,.__"")`-:|._________-"'     (--..__'/--.
                                      /     ,."'    ""-'-"|'  _.,-"_.'-"\\     \\     ` '""
                                   _ )____---------------(|--"_|--'      '__   \\_
                                _,' |  .''''""---.        '""'       ,---'''.   /".
                            _,-'  ." \\/,,..---/_ /                   | -|.._____|  \\_
                          ,-\\,.'''            \\ (                    |"")       "-,  \\
                      _ .".--"                ( :                    | (           '. "\\_
                    ,- ,."                    ; !                    ; |             \\,_ `.
                ___(_(."           -------....L_">        _________.-/_J                '\\_')
                """);

    }

    public void shoot(Character ch1, Character ch2) {
        System.out.println("How many times " + ch1.getN() + " want to hit " + ch2.getN() + "?");
        int s = scannerInt.nextInt();

        if (s == 1) {
            System.out.println(ch1.getN() + " hit " + ch2.getN() + " " + s + " time");
        } else {
            System.out.println(ch1.getN() + " hit " + ch2.getN() + " " + s + " times");
        }
        System.out.println("*LOUD NOISES*");
        System.out.println("blood, blood, blood\n *blood everywhere*");
        System.out.println();

    }

    public void answer(Character ch1, Character ch2) {
        int h;
        do {
            System.out.println("How " + ch2.getN() + " should answer?" + "\n 1.Attack \n 2.Defence");
            h = scannerInt.nextInt();

            switch (h) {
                case 1:
                    shoot(ch2, ch1);
                    break;
                case 2:
                    System.out.println("Oh no, I had to use my armour...");
                    break;
                default:
                    System.out.println("This type of action is not available");
                    break;
            }
        } while (!(h >= 1 && h <= 2));

    }

    public void music(){
        System.out.println("Enter a word 'music'");
        String d = scannerString.nextLine();
        if(d.equals("music")){
            System.out.println("https://www.youtube.com/watch?v=Hf244LCkkLc");
        }
        else{
            System.out.println("That's not the correct word ヽ(ಠ_ಠ)ノ");
        }
    }

    public void action() {
        int cha;
        do {
            System.out.println("Which character is supposed to take an action?");
            showList();
            cha = scannerInt.nextInt();
        } while (!(cha >= 1 && cha <= characters.size()));

        int number2;
        do {
            System.out.println("What do you want to do? \n 1.Go forward \n 2.Show off a weapon \n 3.Change a weapon \n 4.Change an armour \n 5.Show an armour specification \n 6.Fight \n 7.Surprise");
            number2 = scannerInt.nextInt();

            switch (number2) {
                case 1:
                    System.out.println("How many steps do you want to do?");
                    int st = scannerInt.nextInt();
                    characters.get(cha - 1).goForward(st);
                    System.out.println();
                    break;
                case 2:
                    characters.get(cha - 1).doWeaponUsage();
                    System.out.println();
                    break;
                case 3:
                    characters.get(cha - 1).setWeaponUsage(selectWeapon());
                    break;
                case 4:
                    characters.get(cha - 1).setArmourUsage(changeArmour());
                    break;
                case 5:
                    characters.get(cha - 1).doArmourUsage();
                    break;
                case 6:
                    int oppo;
                    do {
                        System.out.println("Which character do you want to fight with?");
                        showList();
                        oppo = scannerInt.nextInt();
                    } while (!(oppo >= 1 && oppo <= characters.size()));

                    if (characters.get(oppo - 1).getN().equals(characters.get(cha - 1).getN())) {
                        System.out.println("You cannot fight yourself!");
                    } else {
                        fight(characters.get(cha - 1), characters.get(oppo - 1));
                    }

                    break;
                case 7:
                    music();
                    break;
                default:
                    System.out.println("This type of action is not available");
                    System.out.println();
            }
        } while (!(number2 >= 1 && number2 <= 7));
    }
}
