package builder;

public class MealBuilder {//the actual builder class responsible to create Meal objects; it defines the process of creating meals
    public Meal prepareVeggieMeal(){
        Meal meal = new Meal();//create new Meal object meal
        meal.addItem(new VegBurger());//add item to meal; you add a new object (new VegBurger())
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVeggieMeal(){
        Meal meal = new Meal();//create new Meal object meal
        meal.addItem(new ChickenBurger());//add item to meal; you add a new object (new ChickenBurger())
        meal.addItem(new Pepsi());
        return meal;
    }
}
