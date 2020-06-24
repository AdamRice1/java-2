package burger_shop;

public class HealthBurger extends Burger {
    public String healthyBurgerTopping1;
    public double healthyBurgerTopping1Price;

    public String healthyBurgerTopping2;
    public double healthyBurgerTopping2Price;

    public String healthyBurgerTopping3;
    public double healthyBurgerTopping3Price;

    public String healthyBurgerTopping4;
    public double healthyBurgerTopping4Price;


   public HealthBurger(String meat, double price){
       super("Health", meat, price, "Wheat");
   }
   public void addHealthTopping1(String name, double price){
       if(name == "bacon" || name == "cheese"){
           throw new IllegalArgumentException("Not a healthy option");
       }
       else {
           this.healthyBurgerTopping1 = name;
           this.healthyBurgerTopping1Price = price;
       }
   }
    public void addHealthTopping2(String name, double price){
        if(name == "bacon" || name == "cheese"){
            throw new IllegalArgumentException("Not a healthy option");
        }
        else {
            this.healthyBurgerTopping2 = name;
            this.healthyBurgerTopping2Price = price;
        }
    }
    public void addHealthTopping3(String name, double price){
        if(name == "bacon" || name == "cheese"){
            throw new IllegalArgumentException("Not a healthy option");
        }
        else {
            this.healthyBurgerTopping3 = name;
            this.healthyBurgerTopping3Price = price;
        }
    }
    public void addHealthTopping4(String name, double price){
        if(name == "bacon" || name == "cheese"){
            throw new IllegalArgumentException("Not a healthy option");
        }
        else {
            this.healthyBurgerTopping4 = name;
            this.healthyBurgerTopping4Price = price;
        }
    }

    public double priceOfTheHealthBurger() {
       double burgerPrice = super.price;
       if(this.healthyBurgerTopping1 == null && this.healthyBurgerTopping2 == null && this.healthyBurgerTopping3 == null && this.healthyBurgerTopping4== null){
           return burgerPrice;
       }
       if(this.healthyBurgerTopping1 != null){
           System.out.println("I am here");
           burgerPrice += healthyBurgerTopping1Price;
       }
        if(this.healthyBurgerTopping2 != null){
            burgerPrice += healthyBurgerTopping2Price;
        }
        if(this.healthyBurgerTopping3 != null){
            burgerPrice += healthyBurgerTopping3Price;
        }
        if(this.healthyBurgerTopping4 != null){
            burgerPrice += healthyBurgerTopping4Price;
        }
        return burgerPrice;
    }
}
