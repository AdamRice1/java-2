package burger_shop;
// || bread != "wheat" || bread != "rye" || bread != "pretzel"
public class Bread {
    private final String bread;

    public Bread(String bread) {
        if(bread !="white"){
            throw new IllegalArgumentException("That is not a bread option!");
        }
        else {
            this.bread = bread;
        }
        }

    public String getBread() {
        return bread;
    }
//
//    public void setBread(String bread) {
//        this.bread = bread;
//    }
}
