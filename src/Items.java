
import java.awt.*;
import java.lang.String;
import java.math.*;
import java.text.DecimalFormat;

public class Items {
//   creating item object and constructor -  to create particular items
   String itemName;
   double itemCost;
   boolean salesTaxExempt;
   boolean imported;

   private static DecimalFormat df2 = new DecimalFormat(".##");

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
            return 0.00;
        } else {
            double salesTax = 0.1*itemCost;
            return Math.round(salesTax*100.0)/100.0;
        }
    }


    public double getImportTax() {
        if (imported){
            double importTax = 0.05*itemCost;;
            return Math.round(importTax*100.0)/100.0;
        } else {
            return 0.00;
        }
    }

    public double getTotalTax(){
        double getTotal = Math.round((getSalesTax()+getImportTax()) * 20);
        double getTotalRounded= getTotal/20;

       return getTotalRounded;
    }


    public void getCostPlusTax(){
        double CostPlusTax = itemCost+getTotalTax();
        System.out.println("1 "+itemName+": $" +String.format("%.2f",CostPlusTax));
    }



}
