package szef_kuchni;

public class ChickenMealDecorator extends MealDecorator {
    public ChickenMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken(){
        System.out.println("Do dania dodaje kurczaka");
    }
}