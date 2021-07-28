package vendingTests;

import ExtendableVendingMachine.product.ExtendableVendingMachine;
import org.junit.jupiter.api.Test;
import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTests {

    @Test
    public void shouldBeAbleToAddSoftDrinkOnly(){
        ExtendableVendingMachine EVM = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        EVM.addStock(softDrink,3);

        assertEquals(3, EVM.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddChocolateOnly(){
        ExtendableVendingMachine EVM = new ExtendableVendingMachine(3, 0, 0, 0);
        Chocolate chocolate = new Chocolate();

        EVM.addStock(chocolate,5);

        assertEquals(5, EVM.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToAddAllProducts(){
        ExtendableVendingMachine EVM = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Muffin muffin = new Muffin();
        Product product = new Product();

        EVM.addStock(saltySnack,4);
        EVM.addStock(chocolate,6);
        EVM.addStock(softDrink,3);
        EVM.addStock(muffin,2);

        assertEquals(15, EVM.getStock(product));
    }

    @Test
    public void shouldBeAbleToBuyAllProducts(){
        ExtendableVendingMachine EVM = new ExtendableVendingMachine(3, 4, 6, 2);
        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Muffin muffin = new Muffin();
        Product product = new Product();

        EVM.buy(saltySnack,2);
        EVM.buy(chocolate,3);
        EVM.buy(softDrink,2);
        EVM.buy(muffin,1);

        assertEquals(8, EVM.getStock(product));
    }

}
