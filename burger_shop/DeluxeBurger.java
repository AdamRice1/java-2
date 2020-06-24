package burger_shop;

public class DeluxeBurger extends Burger {
    public String burgerTopping1;
    public double burgerTopping1Price;

    public String burgerTopping2;
    public double burgerTopping2Price;

    public String burgerTopping3;
    public double burgerTopping3Price;

    public String burgerTopping4;
    public double burgerTopping4Price;

    public String burgerTopping5;
    public double burgerTopping5Price;

    public String burgerTopping6;
    public double burgerTopping6Price;

    public DeluxeBurger(){
        super("Deluxe", "Bacon & Beef", 20.00, "Pretzel");
    }
    public void addBurgerTopping1(String name, double price){
            this.burgerTopping1 = name;
            this.burgerTopping1Price = price;

    }
    public void addBurgerTopping2(String name, double price){
            this.burgerTopping2 = name;
            this.burgerTopping2Price = price;

    }
    public void addBurgerTopping3(String name, double price){
            this.burgerTopping3 = name;
            this.burgerTopping3Price = price;
    }
    public void addBurgerTopping4(String name, double price){
            this.burgerTopping4 = name;
            this.burgerTopping4Price = price;
    }
    public void addBurgerTopping5(String name, double price){
        this.burgerTopping5 = name;
        this.burgerTopping5Price = price;
    }
    public void addBurgerTopping6(String name, double price){
        this.burgerTopping6 = name;
        this.burgerTopping6Price = price;
    }
    public double priceOfTheDeluxeBurger() {
        double burgerPrice = this.price;
        if(this.burgerTopping1 == null && this.burgerTopping2 == null && this.burgerTopping3 == null && this.burgerTopping4== null && this.burgerTopping5 == null && this.burgerTopping6 == null){
            System.out.println("Not really a deluxe burger but whatever...");
            return burgerPrice;
        }
        if(this.burgerTopping1 != null){
            System.out.println("I am here");
            burgerPrice += burgerTopping1Price;
        }
        if(this.burgerTopping2 != null){
            burgerPrice += burgerTopping2Price;
        }
        if(this.burgerTopping3 != null){
            burgerPrice += burgerTopping3Price;
        }
        if(this.burgerTopping4 != null){
            burgerPrice += burgerTopping4Price;
        }
        if(this.burgerTopping5 != null){
            burgerPrice += burgerTopping5Price;
        }
        if(this.burgerTopping6 != null){
            burgerPrice += burgerTopping6Price;
        }
        return burgerPrice;
    }
}

