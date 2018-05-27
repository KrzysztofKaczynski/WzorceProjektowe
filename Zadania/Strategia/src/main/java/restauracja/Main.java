package restauracja;

import restauracja.chef.Chef;
import restauracja.chef.egg_cooker.HardBoiledEggCooker;
import restauracja.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        // Nowe zamówienie - jajka na twardo!

        Chef chef = new Chef("Magda Dupssler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        //Nowe zamówienie - jajka na miękko!

        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
