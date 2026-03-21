package builder;

import builder.meal.Meal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Meal nonPizza = new Meal.MealBuilder("cheese", "coke")
                .setFries("peri")
                .build();

        Meal withPizza = new Meal.MealBuilder("chicken", "thumbsup")
                .setPizza("peri")
                .setDessert("chocolate")
                .build();
    }
}