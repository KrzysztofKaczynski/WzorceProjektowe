package szef_kuchni;

public class RiceMeal extends Meal {

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        System.out.println("Przygotowywuje danie z ryżu.");
    }
}
