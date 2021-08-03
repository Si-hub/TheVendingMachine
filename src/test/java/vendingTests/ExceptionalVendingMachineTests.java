package vendingTests;

import ExceptionalVendingMachine.ExceptionalVendingMachine;
import ExceptionalVendingMachine.Exceptions.ProductNotFoundException;
import ExceptionalVendingMachine.product.Chocolate;
import ExceptionalVendingMachine.product.SaltySnack;
import ExceptionalVendingMachine.product.SoftDrink;
import org.junit.jupiter.api.Test;
import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionalVendingMachineTests {

    @Test
    public void shouldBeAbleThrowAndHandleExceptionForChocolate(){
        ExceptionalVendingMachine evm = new ExceptionalVendingMachine(1,2,0);
        Chocolate chocolate = new Chocolate();

        try {
            evm.buy(chocolate);
            fail("Expected a ChocolatesAllGoneException to be thrown");// fail if this does not throw any exception
        } catch (ProductNotFoundException e) {
            assertEquals("Sorry!! Chocolate is out of stock , but you can select available product.", e.getMessage()) ;
        }

    }

    @Test
    public void shouldBeAbleThrowAndHandleExceptionForSoftDrink(){
        ExceptionalVendingMachine evm = new ExceptionalVendingMachine(0,5,10);
        SoftDrink softDrink = new SoftDrink();

        try {
            evm.buy(softDrink);
            fail("Expected a SoftDrinksOutOfStockException to be thrown");// fail if this does not throw any exception
        } catch (ProductNotFoundException e) {
            assertEquals("Sorry!! Soft Drink is out of stock, but you can select available product.", e.getMessage()) ;
        }

    }

    @Test
    public void shouldBeAbleThrowAndHandleExceptionForSaltySnack(){
        ExceptionalVendingMachine evm = new ExceptionalVendingMachine(2,1,10);
        SaltySnack saltySnack = new SaltySnack();

        try {
            evm.buy(saltySnack);
            evm.buy(saltySnack);
            fail("Expected a SaltyCracksAllEatenException to be thrown");// fail if this does not throw any exception
        } catch (ProductNotFoundException e) {
            assertEquals("Sorry!! Salty snack is out of stock, but you can select available product.", e.getMessage()) ;
        }

    }
}
