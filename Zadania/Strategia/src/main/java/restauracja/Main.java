package restauracja;

import restauracja.chef.Chef;

public class Main {
    public static void main(String[] args) {

        // Nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Magda Dupssler");
        chef.cook();
    }
}
