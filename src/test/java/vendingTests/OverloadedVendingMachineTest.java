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
        OverloadedVendingMachine VM = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        VM.addStock(softDrink);
        VM.addStock(softDrink);
        VM.addStock(softDrink);

        assertEquals(3, VM.getStock(softDrink));
    }
}
