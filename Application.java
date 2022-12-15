package machine;

import java.util.Scanner;

public class Application {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        while (true) {
            String chosenOption = chooseOption();
            action(chosenOption, coffeeMachine);
        }

    } // end of RUN

    private void action(String chosenOption, CoffeeMachine coffeeMachine) {
        switch (chosenOption) {
            case "buy":
                String chosenDrink = chooseDrink();
                switch (chosenDrink) {
                    case "1":
                        coffeeMachine.make(new Espresso());
                        break;
                    case "2":
                        coffeeMachine.make(new Latte());
                        break;
                    case "3":
                        coffeeMachine.make(new Cappuccino());
                        break;
                    case "back":
                        break;
                }
                break;
            case "fill":
                coffeeMachine.fill();
                break;
            case "take":
                System.out.println(coffeeMachine.take());
                break;
            case "remaining":
                System.out.println(reportCoffeeMachine(coffeeMachine.report()));
                break;
            case "exit":
                System.exit(0);
        }
    }

    private String chooseDrink() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        return scanner.nextLine();
    }

    private String chooseOption() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        return scanner.nextLine();
    }

    private String reportCoffeeMachine(CoffeeMachineDTO coffeeMachineDTO) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The coffee machine has:\n").append(String.format("%d ml of water\n", coffeeMachineDTO.waterSupply))
                .append(String.format("%d ml of milk\n", coffeeMachineDTO.milkSupply)).
                append(String.format("%d g of coffee beans\n", coffeeMachineDTO.coffeeSupply)).
                append(String.format("%d disposable cups\n", coffeeMachineDTO.cupsForDrinks)).
                append(String.format("$%d of money\n", coffeeMachineDTO.money));
        return stringBuilder.toString();
    } // end reportCoffeeMachine

} // end of Application
