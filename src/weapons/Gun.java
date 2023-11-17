package weapons;

public class Gun implements WeaponUsage {

    @Override
    public void weaponShowcase() {
        System.out.println("Pif-paf, you have been killed with my gun!");
    }
}
