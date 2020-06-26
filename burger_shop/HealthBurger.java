package burger_shop;

public class HealthBurger extends Burger {
    private String healthyBurgerTopping1;
    private double healthyBurgerTopping1Price;

    private String healthyBurgerTopping2;
    private double healthyBurgerTopping2Price;

    private String healthyBurgerTopping3;
    private double healthyBurgerTopping3Price;

    private String healthyBurgerTopping4;
    private double healthyBurgerTopping4Price;


   private HealthBurger(Meat meat, double price, Bread bread){
       super("Health", meat , price, bread);
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
