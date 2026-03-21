package builder.meal;

public class Meal {
    private String burger;
    private String drink;
    private String pizza;
    private String fries;
    private String dessert;


    private Meal(MealBuilder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.pizza = builder.pizza;
        this.fries =  builder.fries;
        this.dessert = builder.dessert;
    }

    public static class MealBuilder {
        private String burger;
        private String drink;
        private String pizza;
        private String fries;
        private String dessert;

        public MealBuilder (String burger, String drink) {
            this.burger = burger;
            this.drink = drink;
        }

        public MealBuilder setPizza(String pizza) {
            this.pizza = pizza;
            return this;
        }

        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public MealBuilder setFries(String fries) {
            this.fries = fries;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
