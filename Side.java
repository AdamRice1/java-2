package burger_shop;

public class Side {
    private final String[] side;
    private final double price;

    public Side(String[] side, double price) {
        this.side = side;
        this.price = price;
    }

    public String[] getSide() {
        return side;
    }

//    public void setSide(String[] side) {
//        this.side = side;
//    }

    public double getPrice() {
        return price;
    }

}
