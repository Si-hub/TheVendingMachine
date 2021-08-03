package ExceptionalVendingMachine;


import ExceptionalVendingMachine.Exceptions.ChocolatesAllGoneException;
import ExceptionalVendingMachine.Exceptions.ProductNotFoundException;
import ExceptionalVendingMachine.Exceptions.SaltyCracksAllEatenException;
import ExceptionalVendingMachine.Exceptions.SoftDrinksOutOfStockException;
import ExceptionalVendingMachine.product.Chocolate;
import ExceptionalVendingMachine.product.Product;
import ExceptionalVendingMachine.product.SaltySnack;
import ExceptionalVendingMachine.product.SoftDrink;

public class ExceptionalVendingMachine {
    private int SoftDrinks;
    private int SaltySnacks;
    private int Chocolates;

    //Constructor
    public ExceptionalVendingMachine(int SoftDrinks, int SaltySnacks, int Chocolates){
        this.Chocolates = Chocolates;
        this.SoftDrinks = SoftDrinks;
        this.SaltySnacks = SaltySnacks;

    }

    //buy methods
    public void buy(Product product) throws ProductNotFoundException {
        if (product instanceof SoftDrink) {
            if (SoftDrinks > 0) {
                SoftDrinks--;
            } else {
                throw new SoftDrinksOutOfStockException("Sorry!! Soft Drink is out of stock, but you can select " +
                        "available product.");
            }
        }

        if (product instanceof SaltySnack) {
            if (SaltySnacks > 0) {
                SaltySnacks--;
            } else {
                throw new SaltyCracksAllEatenException("Sorry!! Salty snack is out of stock, but you can select " +
                        "available product.");
            }
        }

        if (product instanceof Chocolate) {
            if (Chocolates > 0) {
                Chocolates--;
            } else {
                throw new ChocolatesAllGoneException("Sorry!! Chocolate is out of stock , but you can select " +
                        "available product.");
            }
        }
    }


    public void addStock(Product product, int newStock) {
        if (product instanceof Chocolate) {
            Chocolates += newStock;

        } else if (product instanceof SoftDrink) {
            SoftDrinks += newStock;

        } else if (product instanceof SaltySnack) {
            SaltySnacks += newStock;

        }
    }

    public int getStock(Product product){
        if(product instanceof SoftDrink){
          return SoftDrinks;
        }else if (product instanceof SaltySnack){
           return SaltySnacks;
        }else if (product instanceof Chocolate){
           return Chocolates;
        }else {
            return SaltySnacks + SoftDrinks + Chocolates;
        }
    }

}
