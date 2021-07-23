package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;


public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public static void main(String[] args) {

    }

    // add a constructor like this to you OverloadedVendingMachine class
    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        this.chocolatesQty = chocolatesQty;
        this.saltySnacksQty = saltySnacksQty;
        this.softDrinkQty = softDrinkQty;

    }

    //buy methods
    public void buy(SoftDrink softdrink){
        if (softdrink != null){
            softDrinkQty--;
        }else {
            System.out.println("Soft drink is out of stock");
        }
    }

    void buy(SaltySnack saltySnack){
        if (saltySnack != null){
            saltySnacksQty--;
        }else {
            System.out.println("Salty snack drink is out of stock");
        }
    }

    void buy(Chocolate chocolate){
        if (chocolate != null){
            chocolatesQty--;
        }else {
            System.out.println("Soft drink is out of stock");
        }
    }

    void buy(Product product){
        chocolatesQty--;
        saltySnacksQty--;
        softDrinkQty--;
    }

    // Adding stock (addstock methods)
    public void addStock(SoftDrink softdrink){
        if(softdrink != null){
            softDrinkQty++;
        }else{
            System.out.println("Please select your product");
        }

    }

    void addStock(SaltySnack saltySnack){
        if (saltySnack != null){
            saltySnacksQty++;
        }else {
            System.out.println("Please select your product");
        }
    }

    void addStock(Chocolate chocolate){
        if (chocolate != null){
            chocolatesQty++;
        }else {
            System.out.println("Please select your product");
        }
    }

    void addStock(Product product){
        softDrinkQty++;
        saltySnacksQty++;
        chocolatesQty++;
    }

    //Getting the stock level
    public int getStock(SoftDrink softdrink){
        return softDrinkQty;
    }
    int getStock(SaltySnack saltySnack){
        return saltySnacksQty;
    }
    int getStock(Chocolate chocolate){
        return chocolatesQty;
    }

    public int getStock(){
        int total = chocolatesQty + softDrinkQty + saltySnacksQty;
        return total;
    }

}
