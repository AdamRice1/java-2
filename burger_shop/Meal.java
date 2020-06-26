package burger_shop;

public class Meal {
    private Drink drink;
    private  Side side;
    private  Burger burger;

    public Meal(Drink drink, Side side, Burger burger) {
        this.drink = drink;
        this.side = side;
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Side getSide() {
        return side;
    }

    public Burger getBurger() {
        return burger;
    }

    public final void setDrink(Drink drink) {
        this.drink = drink;
    }

    public final void setSide(Side side) {
        this.side = side;
    }

    public final void setBurger(Burger burger) {
        this.burger = burger;
    }

}
