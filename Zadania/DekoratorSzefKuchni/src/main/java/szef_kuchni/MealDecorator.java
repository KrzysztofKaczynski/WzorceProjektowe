package szef_kuchni;

abstract public class MealDecorator extends Meal {

    Meal meal;
    MealDecorator(Meal meal){
        this.meal = meal;

    }
    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();

    }
}
