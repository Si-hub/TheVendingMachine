package vendingTests;

import org.junit.jupiter.api.Test;
import vending.OverloadedVendingMachine;
import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedVendingMachineTest {

    @Test
    public void shouldBeAbleToAddSoftDrinkOnly(){
        OverloadedVendingMachine VM = new OverloadedVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        VM.addStock(softDrink);
        VM.addStock(softDrink);
        VM.addStock(softDrink);

        assertEquals(3, VM.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddChocolateOnly(){
        OverloadedVendingMachine VM = new OverloadedVendingMachine(3, 0, 0, 0);
        Chocolate chocolate = new Chocolate();

        VM.addStock(chocolate);
        VM.addStock(chocolate);

        assertEquals(2, VM.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToAddSaltySnackOnly(){
        OverloadedVendingMachine VM = new OverloadedVendingMachine(3, 0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        VM.addStock(saltySnack);

        assertEquals(1, VM.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToAddAllProducts(){
        OverloadedVendingMachine VM = new OverloadedVendingMachine(3, 2, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        VM.addStock(saltySnack);
        VM.addStock(chocolate);
        VM.addStock(softDrink);

        assertEquals(8, VM.getStock());
    }

    @Test
    public void shouldBeAbleToBuyAllProducts(){
        OverloadedVendingMachine VM = new OverloadedVendingMachine(3, 2, 2,0);
        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        VM.buy(softDrink);
        VM.buy(saltySnack);
        VM.buy(chocolate);

        assertEquals(4, VM.getStock());
    }
}
