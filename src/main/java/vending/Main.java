package vending;

import vending.product.Chocolate;
import vending.product.Muffin;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class Main {
    public static void main(String[] args) {

        OverloadedVendingMachine VM = new OverloadedVendingMachine(0,0,0,0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Muffin muffin = new Muffin();

        VM.addStock(softDrink);
        VM.addStock(saltySnack);
        VM.addStock(chocolate);
        VM.addStock(chocolate);
        VM.addStock(muffin);

        VM.buy(softDrink);
        VM.buy(saltySnack);
        VM.buy(chocolate);
        VM.buy(muffin);

        VM.getStock(softDrink);
        VM.getStock(saltySnack);
        VM.getStock(chocolate);
        VM.getStock(muffin);

        System.out.println("Soft Drinks: " + VM.getStock(softDrink));
        System.out.println("Salty Snack: "  + VM.getStock(saltySnack));
        System.out.println("Chocolates: " + VM.getStock(chocolate));
        System.out.println("Muffins: " + VM.getStock(muffin));
        System.out.println("Entire Stock: " + VM.getStock());

    }
}