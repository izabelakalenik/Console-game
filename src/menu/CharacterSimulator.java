package menu;

public class CharacterSimulator {
    public static void main(String[] args){

      Menu menu = new Menu();

      System.out.println("Welcome to the Character Simulator!");
      System.out.println();

      menu.info1();
      menu.create();
      menu.selectWeapon();

      menu.mainMenu();




    }


}
