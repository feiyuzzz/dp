package builder;

public class TestBuilder {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVugMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVugMeal.showItems();
        System.out.println("Total Cost:" + nonVugMeal.getCost());
    }
}
