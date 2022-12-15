package machine;

public class Latte extends Drink {

    public final int waterNeeded = 350;
    public final int milkNeeded = 75;
    public final int coffeeNeeded = 20;
    public final int price = 7;

    public Latte() {
        super.waterNeeded = this.waterNeeded;
        super.milkNeeded = this.milkNeeded;
        super.coffeeNeeded = this.coffeeNeeded;
        super.price = this.price;
    }

}
