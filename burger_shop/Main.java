package burger_shop;

public class Main {
    public static void main(String[] args) {
        // This section is Ex. 1
        Meat meat1 = new Meat("turkey");
        Bread bread1 = new Bread("Wheat");
        HealthBurger ham1 = new HealthBurger(meat1, 5.00, bread1);
        ham1.addHealthTopping1("onion", 1.00);
        System.out.println(ham1.priceOfTheHealthBurger());

        Meat meat2 = new Meat("beef");
        Bread bread2 = new Bread("White");
        Burger ham2 = new Burger("Plain", meat2, 1.00, bread2);
        ham2.addTopping1("peanuts", 1.00);
        System.out.println(ham2.priceOfTheBurger());

        Meat meat3 = new Meat("bacon");
        Bread bread3 = new Bread("Pretzel");
        DeluxeBurger ham3 = new DeluxeBurger(meat3, bread3);
        ham3.addBurgerTopping1("Jelly", 2.00);
        System.out.println(ham3.priceOfTheDeluxeBurger());
        // End of Ex. 1
        //Beginning of Ex. 2
        Drink drink1 = new Drink("Coke", 1.00);
        String[] item = {"Fries"};
        Side side1 = new Side(item, 1.00);
        Burger burger1 = new Burger("Plain", meat2, 3.00, bread2);

        Meal meal1 = new Meal(drink1, side1, burger1);
        System.out.println(meal1.getBurger().meat);
        Order order1 = new Order(meal1);
        System.out.println(order1.getMeal().getBurger().meat.getMeat());
        order1.addSides(item);
        order1.addBurger(ham2);
        String[] tops = {"fish", "extra meat"};
        order1.addToppings(tops);
        order1.purchase();
        // End of Ex. 2
    }
}
