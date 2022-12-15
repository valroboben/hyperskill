package machine;

import java.util.Scanner;

public class CoffeeMachine {


    public CoffeeMachineDTO report() {
        CoffeeMachineDTO coffeeMachineDTO = new CoffeeMachineDTO(waterSupply, milkSupply, coffeeSupply, cupsForDrinks, money);
        return coffeeMachineDTO;
    }

    private final Scanner scanner = new Scanner(System.in);
    private int waterSupply = 400;
    private int milkSupply = 540;
    private int coffeeSupply = 120;
    private int cupsForDrinks = 9;
    private int money = 550;

    public void make(Drink drink) {
        if (waterSupply < drink.waterNeeded) {
            System.out.println("Sorry, not enough water!");
        } else if (milkSupply < drink.milkNeeded) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeSupply < drink.coffeeNeeded) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            waterSupply -= drink.waterNeeded;
            milkSupply -= drink.milkNeeded;
            coffeeSupply -= drink.coffeeNeeded;
            money += drink.price;
            cupsForDrinks--; // стоит ли городить this.cupsForDrinks - ну и строками выше ?
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add:");
        this.waterSupply += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        this.milkSupply += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.coffeeSupply += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups you want to add:");
        this.cupsForDrinks += Integer.parseInt(scanner.nextLine());
    }

    public String take() {
        int tmp = money;
        money = 0;
        return String.format("I gave you $%d\n", tmp);
    }
} // end of CoffeeMachine
