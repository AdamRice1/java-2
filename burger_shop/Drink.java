package burger_shop;

public class Drink {
    private final String drink;
    private final double price;

    public Drink(String drink, double price) {
       if(drink != "soda" || drink != "water" || drink != "milk" || drink != "tea"){
           throw new IllegalArgumentException("That is not a drink option!");
       }
       else {
           this.drink = drink;
           this.price = price;
       }
    }

    public String getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

//    public void setDrink(String drink) {
//        this.drink = drink;
//    }
}
