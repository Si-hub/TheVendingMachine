package ExceptionalVendingMachine.Exceptions;

public class SaltyCracksAllEatenException extends ProductNotFoundException{
    public SaltyCracksAllEatenException(String error) {
        super(error);
    }
}
