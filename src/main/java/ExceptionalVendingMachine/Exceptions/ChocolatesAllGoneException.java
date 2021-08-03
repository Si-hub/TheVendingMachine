package ExceptionalVendingMachine.Exceptions;

public class ChocolatesAllGoneException extends ProductNotFoundException{

    public ChocolatesAllGoneException(String error) {
        super(error);
    }
}
