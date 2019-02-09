
import java.awt.*;
import java.lang.String;
import java.math.*;

public class Items {
//   creating item object and constructor -  to create particular items
   String itemName;
   double itemCost;
   boolean salesTaxExempt;
   boolean imported;


   public Items (
           String inputItemName,
           double inputItemCost,
           boolean inputSalesTaxExempt,
           boolean inputImported)
         {
            this.itemName = inputItemName;
            this.itemCost = inputItemCost;
             this.salesTaxExempt = inputSalesTaxExempt;
             this.imported = inputImported;
         }


   public double getSalesTax(){
        if (salesTaxExempt){
             double salesTax  = 0.00;
            return salesTax;
        } else {
            double salesTax = 0.1;
            return salesTax;
        }
    }


    public double getImportTax() {
        if (imported){
            double importTax = 0.05;
            return importTax;
        } else {
            double importTax = 0.0;
            return importTax;
        }
    }

//    double totalTax = this.getSalesTax()+ this.getImportTax();
    public BigDecimal roundTax(double input){
        BigDecimal bInput = new BigDecimal(input);
        MathContext M = new MathContext(4); //4 precision
        BigDecimal output = bInput.round(M);
        return output;
    }

}
