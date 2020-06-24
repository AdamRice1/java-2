package burger_shop;

public class Main {
    public static void main(String[] args) {
        HealthBurger ham1 = new HealthBurger("beef", 5.00);
        ham1.addHealthTopping1("onion", 1.00);
        System.out.println(ham1.priceOfTheHealthBurger());

        Burger ham2 = new Burger("Plain", "beef", 1.00, "white");
        ham2.addTopping1("peanuts", 1.00);
        System.out.println(ham2.priceOfTheBurger());

        DeluxeBurger ham3 = new DeluxeBurger();
        ham3.addBurgerTopping1("Jelly", 2.00);
        System.out.println(ham3.priceOfTheDeluxeBurger());
    }
}
