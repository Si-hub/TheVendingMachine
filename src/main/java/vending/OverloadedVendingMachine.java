package vending;

import vending.product.*;


public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;
    private int muffinQty;

    public static void main(String[] args) {

    }

    // add a constructor like this to you OverloadedVendingMachine class
    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int muffinQty){
        this.chocolatesQty = chocolatesQty;
        this.saltySnacksQty = saltySnacksQty;
        this.softDrinkQty = softDrinkQty;
        this.muffinQty = muffinQty;

    }

    //buy methods
    public void buy(SoftDrink softdrink){
        if (softdrink != null){
            softDrinkQty--;
        }else {
            System.out.println("Soft drink is out of stock");
        }
    }


    public void buy(Muffin muffin){
        if (muffin != null){
            muffinQty--;
        }else {
            System.out.println("Muffin is out of stock");
        }
    }

   public void buy(SaltySnack saltySnack){
        if (saltySnack != null){
            saltySnacksQty--;
        }else {
            System.out.println("Salty snack drink is out of stock");
        }
    }

   public void buy(Chocolate chocolate){
        if (chocolate != null){
            chocolatesQty--;
        }else {
            System.out.println("Soft drink is out of stock");
        }
    }

   public void buy(Product product){
        chocolatesQty--;
        saltySnacksQty--;
        softDrinkQty--;
        muffinQty--;
    }

    // Adding stock (addstock methods)
    public void addStock(SoftDrink softdrink){
        if(softdrink != null){
            softDrinkQty++;
        }

    }

    public void addStock(Muffin muffin){
        if (muffin != null){
            muffinQty++;
        }
    }

    public void addStock(SaltySnack saltySnack){
        if (saltySnack != null){
            saltySnacksQty++;
        }
    }

    public void addStock(Chocolate chocolate){
        if (chocolate != null){
            chocolatesQty++;
        }
    }

    public void addStock(Product product){
        softDrinkQty++;
        saltySnacksQty++;
        chocolatesQty++;
    }

    //Getting the stock level
    public int getStock(SoftDrink softdrink){
        return softDrinkQty;
    }

    public int getStock(Muffin muffin){
        return muffinQty;
    }
    public int getStock(SaltySnack saltySnack){
        return saltySnacksQty;
    }
    public int getStock(Chocolate chocolate){
        return chocolatesQty;
    }

    public int getStock(){
        int total = chocolatesQty + softDrinkQty + saltySnacksQty + muffinQty;
        return total;
    }

}
