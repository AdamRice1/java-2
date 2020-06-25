package burger_shop;

public class Burger {
    public String name;
    public Meat meat;
    public double price;
    public Bread bread;
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
        this.topping1 = name;
        this.topping1Price = price;
    }
    public void addTopping2(String name, double price){
        this.topping2 = name;
        this.topping2Price = price;
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
