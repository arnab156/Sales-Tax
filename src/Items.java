
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
            double salesTax = 0.1*this.itemCost;
            double salesTaxRounded=Math.round(salesTax*100.0)/100.0;
            return salesTaxRounded;
        }
    }


    public double getImportTax() {
        if (imported){
            double importTax = 0.05*this.itemCost;;
            double importTaxRounded = Math.round(importTax*100.0)/100.0;
            return importTaxRounded;
        } else {
            return 0.00;
        }
    }

    public double getTotalTax(){
        double getTotal = getSalesTax()+getImportTax();
        double getTotal_1 = Math.round(getTotal * 20);
        double getTotalRounded= getTotal_1/20;

       return getTotalRounded;
    }


    public void getCostPlusTax(){
        double totalTax = getTotalTax();
        double CostPlusTax = this.itemCost+totalTax;
        System.out.println("1 "+this.itemName+": $"+  df2.format(CostPlusTax));
    }


}
