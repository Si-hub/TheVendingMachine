package ExceptionalVendingMachine.Exceptions;

public class SoftDrinksOutOfStockException extends ProductNotFoundException{
    public SoftDrinksOutOfStockException(String error) {
        super(error);
    }
}
