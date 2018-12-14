package builder;

public class BuilderPatternDemo {
    public static void main(String[] args){

        MealBuilder mealBuilder = new MealBuilder();//create new object

        Meal vegMeal = mealBuilder.prepareVeggieMeal();//prepare a veggie meal
        System.out.println("Veggie Meal");
        vegMeal.showItems();//indicate the items in the meal
        System.out.println("Total cost: " + vegMeal.getCost());//indicate total cost

        System.out.println("---------------------------------------------------");

        Meal nonVegMeal = mealBuilder.prepareNonVeggieMeal();
        System.out.println("Non-veggie meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());

    }
}
