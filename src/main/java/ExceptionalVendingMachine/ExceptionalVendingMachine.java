package ExceptionalVendingMachine;

import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

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
    public void buy(SoftDrink softdrink){
        try {
            if (softdrink != null)
                SoftDrinks--;
        }catch (Exception e){
            System.out.println("Sorry!! Soft drink is out of stock");
        }
    }

    public void buy(SaltySnack saltySnack){
        try {
            if (saltySnack != null)
                SaltySnacks--;
        }catch (Exception e){
            System.out.println("Sorry!! Salty snack is out of stock");
        }
    }

    public void buy(Chocolate chocolate){

        try {
            if (chocolate != null)
                Chocolates--;
        }catch (Exception e){
            System.out.println("Soft drink is out of stock");
        }

    }

}
