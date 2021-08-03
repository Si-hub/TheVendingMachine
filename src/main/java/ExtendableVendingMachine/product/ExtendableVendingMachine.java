package ExtendableVendingMachine.product;


import vending.product.*;

public class ExtendableVendingMachine {

   private int SoftDrinks;
   private int SaltySnacks;
   private int Chocolates;
   private int Muffins;

   //Constructor
   public ExtendableVendingMachine(int SoftDrinks, int SaltySnacks, int Chocolates, int Muffins){
       this.Chocolates = Chocolates;
       this.SoftDrinks = SoftDrinks;
       this.SaltySnacks = SaltySnacks;
       this.Muffins = Muffins;
   }

   //use InstanceOf operator on buy()
   public void buy(Product product){
        if (product instanceof Chocolate && Chocolates > 0) {
           Chocolates--;

        }else if(product instanceof SoftDrink && SoftDrinks > 0){
            SoftDrinks--;

        }else if (product instanceof SaltySnack && SaltySnacks > 0){
            SaltySnacks--;
        }else if (product instanceof Muffin && Muffins > 0){
            Muffins--;
        }
   }

    public void buy(Product product, int qty){
        if (product instanceof Chocolate && Chocolates > 0) {
            Chocolates -= qty;

        }else if(product instanceof SoftDrink && SoftDrinks > 0){
            SoftDrinks -= qty;

        }else if (product instanceof SaltySnack && SaltySnacks > 0){
            SaltySnacks -= qty;
        }else if (product instanceof Muffin && Muffins > 0){
            Muffins -= qty;
        }
    }

    //use InstanceOf operator on addStock()
    public void addStock(Product product, int qty) {
        if (product instanceof Chocolate) {
           Chocolates += qty;

        } else if (product instanceof SoftDrink) {
           SoftDrinks += qty;

        } else if (product instanceof SaltySnack) {
            SaltySnacks += qty;

        }else if (product instanceof Muffin){
           Muffins += qty;
        }
    }

    //use InstanceOf operator on getStock()
    public int getStock(Product product){
        if (product instanceof Chocolate){
            return Chocolates;
        }else if (product instanceof SoftDrink){
            return SoftDrinks;
        }else if (product instanceof SaltySnack){
            return SaltySnacks;
        }else if (product instanceof Muffin){
            return Muffins;
        }else {
            return Chocolates + SoftDrinks + SaltySnacks + Muffins;
        }


    }
}
