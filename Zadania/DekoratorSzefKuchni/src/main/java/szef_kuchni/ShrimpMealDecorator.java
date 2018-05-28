package szef_kuchni;

public class ShrimpMealDecorator extends MealDecorator {
    public ShrimpMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }

    private void addShrimp(){
        System.out.println("Do dania dodaje krewetkę");
    }
}
