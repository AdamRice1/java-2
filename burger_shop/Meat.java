package burger_shop;
// || meat != "turkey" || meat != "bacon" || meat != "bean"
public class Meat {
    private final String meat;

    public Meat(String meat) {
        System.out.println("new beef");
        if(meat != "beef"){
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
