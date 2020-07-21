package burger_shop;

public class Burger {
    private final String name;
    private final Meat meat;
    public final double price;
    private final Bread bread;
    public String topping1;
    public double topping1Price;
    public String topping2;
    public double topping2Price;

    public Burger(String name, Meat meat, double price, Bread bread){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }
    public void addTopping1(String name, double price){
        if(name !="pickles") {
            throw new IllegalArgumentException("That is not a topping option!");
        }
        else {
            this.topping1 = name;
            this.topping1Price = price;
        }
    }
    public void addTopping2(String name, double price){
        if(name != "lettuce") {
            throw new IllegalArgumentException("That is not a topping option!");
        }
        else {
            this.topping2 = name;
            this.topping2Price = price;
        }
    }
    public double priceOfTheBurger() {
        double burgerPrice = this.price;
        if(this.topping1 == null && this.topping2 == null){
            System.out.println("This is the price of the burger in the normal burger" + this.price);
        }
        if(this.topping1 != null && this.topping2 == null){
            burgerPrice += topping1Price;
            System.out.println("This is the price of the burger with 1 topping" + this.price +" + "+ this.topping1Price);
        }
        if(this.topping1 != null && this.topping2 != null){
            burgerPrice += (topping1Price + topping2Price);
            System.out.println("This is the price of the burger with 2 toppings" + this.price + " + " + this.topping1Price + " + " + this.topping2Price);
        }

        return burgerPrice;
    }
}
