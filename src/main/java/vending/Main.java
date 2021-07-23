package vending;

import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class Main {
    public static void main(String[] args) {

        OverloadedVendingMachine VM = new OverloadedVendingMachine(1, 2, 3);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        VM.addStock(softDrink);
        VM.addStock(saltySnack);
        VM.addStock(chocolate);
        VM.addStock(chocolate);

        VM.buy(softDrink);
        VM.buy(saltySnack);
        VM.buy(chocolate);

        VM.getStock(softDrink);
        VM.getStock(saltySnack);
        VM.getStock(chocolate);

        System.out.println("Soft Drinks: " + VM.getStock(softDrink));
        System.out.println("Salty Snack: "  + VM.getStock(saltySnack));
        System.out.println("Chocolates: " + VM.getStock(chocolate));
        System.out.println("Entire Stock: " + VM.getStock());
    }
}