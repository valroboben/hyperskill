package machine;

public class Espresso extends Drink {

    public final int waterNeeded = 250;
    public final int milkNeeded = 0;
    public final int coffeeNeeded = 16;
    public final int price = 4;

    public Espresso() {
        super.waterNeeded = this.waterNeeded;
        super.milkNeeded = this.milkNeeded;
        super.coffeeNeeded = this.coffeeNeeded;
        super.price = this.price;
    }

}
