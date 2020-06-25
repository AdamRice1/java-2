package burger_shop;

public class Order {
    private Meal meal;
    private Burger burger;
    private Bread bread;
    private Meat meat;
    private double price;

    public Order(Meal meal) {
        this.meal = meal;
    }

    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
    }

    public Meal getMeal() {
        return meal;
    }

    public Burger getBurger() {
        return burger;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void addToppings(String[] toppings){
        for(int i = 0; i < toppings.length; i++){
            this.price += 1.00;
        }

    }
    public void addSides(String[] sides){
        for(int x = 0; x < sides.length; x++){
            this.price += 2.00;
        }
    }
    public void addBurger(Burger burger){
        this.meal.setBurger(burger);
    }
    public void purchase(){
        System.out.println("Thank you for your purchase. Your total is " + this.price + " plus the cost of the burgers.");
    }
}
