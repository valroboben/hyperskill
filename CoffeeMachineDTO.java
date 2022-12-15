package machine;

public class CoffeeMachineDTO {

    public final int waterSupply;
    public final int milkSupply;
    public final int coffeeSupply;
    public final int cupsForDrinks;
    public final int money;

    public CoffeeMachineDTO(int waterSupply, int milkSupply, int coffeeSupply, int cupsForDrinks, int money) {
        this.waterSupply = waterSupply;
        this.milkSupply = milkSupply;
        this.coffeeSupply = coffeeSupply;
        this.cupsForDrinks = cupsForDrinks;
        this.money = money;
    }

}
