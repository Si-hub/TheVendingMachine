package ExceptionalVendingMachine;

import ExceptionalVendingMachine.Exceptions.ProductNotFoundException;
import ExceptionalVendingMachine.product.Chocolate;
import ExceptionalVendingMachine.product.Product;
import ExceptionalVendingMachine.product.SaltySnack;
import ExceptionalVendingMachine.product.SoftDrink;

public class Main {
    public static void main(String[] args) {

        ExceptionalVendingMachine evm = new ExceptionalVendingMachine(0,0,0);
        SaltySnack saltySnack = new SaltySnack();
        SoftDrink softDrink = new SoftDrink();
        Chocolate chocolate = new Chocolate();
        Product product = new Product();

        evm.addStock(softDrink,1);
        evm.addStock(saltySnack,1);
        evm.addStock(chocolate,3);

        try {
            evm.buy(softDrink);
            evm.buy(softDrink);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(evm.getStock(softDrink));

    }
}
