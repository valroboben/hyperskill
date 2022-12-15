package machine;

public class Cappuccino extends Drink {

    public final int waterNeeded = 200;
    public final int milkNeeded = 100;
    public final int coffeeNeeded = 12;
    public final int price = 6;

    public Cappuccino() {
        super.waterNeeded = this.waterNeeded;
        super.milkNeeded = this.milkNeeded;
        super.coffeeNeeded = this.coffeeNeeded;
        super.price = this.price;
    }

}
