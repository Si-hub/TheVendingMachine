package ExtendableVendingMachine.product;

import vending.product.*;

public class Main {

    public static void main(String[] args) {

        ExtendableVendingMachine EVM = new ExtendableVendingMachine(0,0,0,0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Muffin muffin = new Muffin();
        Product product = new Product();

        EVM.addStock(softDrink,2);
        EVM.addStock(saltySnack,1);
        EVM.addStock(chocolate,3);
        EVM.addStock(muffin,3);

        EVM.buy(softDrink,1);
        EVM.buy(saltySnack,1);
        EVM.buy(chocolate,1);
        EVM.buy(muffin,1);


        System.out.println("Extendable Muffins: " + EVM.getStock(muffin));
        System.out.println("Extendable Soft Drinks: " + EVM.getStock(softDrink));
        System.out.println("Extendable Salty Snack: " + EVM.getStock(saltySnack));
        System.out.println("Extendable Chocolate: " + EVM.getStock(chocolate));
        System.out.println("Extendable Entire Stock: " + EVM.getStock(product));
    }
}
