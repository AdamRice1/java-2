package burger_shop;

public class Meat {
    private final String meat;

    public Meat(String meat) {
        if(meat != "beef" || meat != "turkey" || meat != "bacon" || meat != "bean"){
            throw new IllegalArgumentException("That is not a meat option!");
        }
        else {
            this.meat = meat;
        }
    }

    public String getMeat() {
        return meat;
    }

//    public void setMeat(String meat) {
//        this.meat = meat;
//    }
}
