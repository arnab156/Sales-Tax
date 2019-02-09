import java.awt.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;

public class Main {

   public static void main(String[] args) {

      Items book = new Items("book",12.49,true,false);
      Items chocolate = new Items("chocolate bar", 0.85,true,false);
      Items CD = new Items("music CD",14.99, false, false);
      Items importedChocolate = new Items("imported box of chocolates", 10.00,true,true);
//      Items importedChocolate2 = new Items("imported box of chocolates", 11.25,true,true);
      Items importedPerfume = new Items("imported bottle of perfume", 47.50,false,true);
//      Items importedPerfume2 = new Items("imported bottle of perfume", 27.99,false,true);
      Items perfume = new Items("bottle of perfume", 18.99,false,false);
      Items headache = new Items("packet of headache pills", 9.75,true,false);


      //USER WILL INPUT NUMBERS TO SEE EITHER RECEIPT #1, #2 OR #3. TO SEE ALL RECEIPTS TOGETHER ENTER ANY OTHER NUMBER.
      //ONLY ACCEPTABLE INPUT IS A WHOLE INTEGER NUMBER
      System.out.println("Enter number 1,2 or 3 to see each receipt, press any NUMBER to see all receipts: ");
      Scanner input = new Scanner(System.in);
      int userNumber = input.nextInt();
      System.out.println("--------------------NUMBER CHOSEN:---------------------");
      System.out.println("---------------------------"+userNumber+"----------------------------");

      if (userNumber == 1){

         //BOOK
         double bookTax1 = book.getImportTax();                                      //calculating import duty, if imported
         double bookTax2 = book.getSalesTax();                                       //calculating service tax exempt, if exempted.
         double totalBookTax = (bookTax1+bookTax2)*book.itemCost;                    //total tax for this item
         System.out.println("1 "+book.itemName+": $"+(book.itemCost+totalBookTax));  //PRINT PRICE OF THE ITEM WITH TAXES
         //CD
         double CDTax1 = CD.getImportTax();
         double CDTax2 = CD.getSalesTax();
         double totalCDTax = (CDTax1+CDTax2)*CD.itemCost;
         double itemCostTax = CD.itemCost+totalCDTax;
         double itemRounded = Math.round( itemCostTax*100.0)/100.0;
         System.out.println("1 "+CD.itemName+": $"+ itemRounded) ;
         //CHOCOLATE
         double chocolateTax1 = chocolate.getImportTax();
         double chocolateTax2 = chocolate.getSalesTax();
         double totalChocolateTax = (chocolateTax1+chocolateTax2)*chocolate.itemCost;
         System.out.println("1 "+chocolate.itemName+": $"+(chocolate.itemCost+totalChocolateTax));

         //SALES TAX CALCULATION
         double grandTotalTax = totalBookTax+totalCDTax+totalChocolateTax;
         double grandTotalTaxRounded = Math.round( grandTotalTax *100.00)/100.00;
         System.out.println("Sales Taxes: $"+grandTotalTaxRounded);
         //TOTAL AMOUNT
         double ticketSize = book.itemCost+totalBookTax +CD.itemCost+totalCDTax+chocolate.itemCost+totalChocolateTax;
         double ticketSizeRounded = Math.round( ticketSize*100.0)/100.0;
         System.out.println("Total: $"+ ticketSizeRounded);

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");

      } else if (userNumber == 2){
         //IMPORTED CHOCOLATE
         double importedChocolateTax1 = importedChocolate.getImportTax();
         double importedChocolateTax2 = importedChocolate.getSalesTax();
         double totalImportedChocolateTax = (importedChocolateTax1+importedChocolateTax2)*importedChocolate.itemCost;
         System.out.println("1 "+importedChocolate.itemName+": $"+(importedChocolate.itemCost+totalImportedChocolateTax));

         //IMPORTED PERFUME
         double importedPerfumeTax1 = importedPerfume.getImportTax();
         double importedPerfumeTax2 = importedPerfume.getSalesTax();
         double totalImportedPerfumeTax = (importedPerfumeTax1+importedPerfumeTax2)*importedPerfume.itemCost;
         System.out.println("1 "+importedPerfume.itemName+": $"+(importedPerfume.itemCost+totalImportedPerfumeTax));

         //SALES TAX CALCULATION
         double grandTotalTax = totalImportedChocolateTax +totalImportedPerfumeTax;
         System.out.println("Sales Taxes: "+grandTotalTax);
         System.out.println("Total: "+ (importedChocolate.itemCost+importedPerfume.itemCost+grandTotalTax));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");

      } else if (userNumber == 3){
         //IMPORTED PERFUME
         importedPerfume.itemCost=27.99;
         double importedPerfumeTax1 = importedPerfume.getImportTax();
         double importedPerfumeTax2 = importedPerfume.getSalesTax();
         double totalImportedPerfumeTax = (importedPerfumeTax1+importedPerfumeTax2)*importedPerfume.itemCost;
         System.out.println("1 "+importedPerfume.itemName+": $"+(importedPerfume.itemCost+totalImportedPerfumeTax));

         //PERFUME
         double PerfumeTax1 = perfume.getImportTax();
         double PerfumeTax2 = perfume.getSalesTax();
         double totalPerfumeTax = (PerfumeTax1+PerfumeTax2)*perfume.itemCost;
         System.out.println("1 "+perfume.itemName+": $"+(perfume.itemCost+totalPerfumeTax));

         //HEADACHE
         double headTax1 = headache.getImportTax();
         double headTax2 = headache.getSalesTax();
         double totalHeadacheTax = (headTax1+headTax2)*headache.itemCost;
         System.out.println("1 "+headache.itemName+": $"+(headache.itemCost+totalHeadacheTax));

         //CHOCOLATE
         importedChocolate.itemCost = 11.25;
         double importedChocolateTax1 = importedChocolate.getImportTax();
         double importedChocolateTax2 = importedChocolate.getSalesTax();
         double totalImportedChocolateTax = (importedChocolateTax1+importedChocolateTax2)*importedChocolate.itemCost;
         System.out.println("1 "+importedChocolate.itemName+": $"+(importedChocolate.itemCost+totalImportedChocolateTax));

         //SALES TAX
         double grandTotalTax = totalImportedPerfumeTax+totalPerfumeTax+totalImportedChocolateTax +totalHeadacheTax;
         System.out.println("Sales Taxes: "+grandTotalTax);
         System.out.println("Total: "+ (importedPerfume.itemCost+perfume.itemCost+headache.itemCost+importedChocolate.itemCost+grandTotalTax));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");

      } else {

         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");
         //BOOK
         double bookTax1 = book.getImportTax();                                      //calculating import duty, if imported
         double bookTax2 = book.getSalesTax();                                       //calculating service tax exempt, if exempted.
         double totalBookTax = (bookTax1+bookTax2)*book.itemCost;                    //total tax for this item
         System.out.println("1 "+book.itemName+": $"+(book.itemCost+totalBookTax));  //PRINT PRICE OF THE ITEM WITH TAXES
         //CD
         double CDTax1 = CD.getImportTax();
         double CDTax2 = CD.getSalesTax();
         double totalCDTax = (CDTax1+CDTax2)*CD.itemCost;
         double itemCostTax = CD.itemCost+totalCDTax;
         double itemRounded = Math.round( itemCostTax*100.0)/100.0;
         System.out.println("1 "+CD.itemName+": $"+ itemRounded) ;
         //CHOCOLATE
         double chocolateTax1 = chocolate.getImportTax();
         double chocolateTax2 = chocolate.getSalesTax();
         double totalChocolateTax = (chocolateTax1+chocolateTax2)*chocolate.itemCost;
         System.out.println("1 "+chocolate.itemName+": $"+(chocolate.itemCost+totalChocolateTax));

         //SALES TAX CALCULATION
         double grandTotalTax = totalBookTax+totalCDTax+totalChocolateTax;
         double grandTotalTaxRounded = Math.round( grandTotalTax *100.00)/100.00;
         System.out.println("Sales Taxes: $"+grandTotalTaxRounded);
         //TOTAL AMOUNT
         double ticketSize = book.itemCost+totalBookTax +CD.itemCost+totalCDTax+chocolate.itemCost+totalChocolateTax;
         double ticketSizeRounded = Math.round( ticketSize*100.0)/100.0;
         System.out.println("Total: $"+ ticketSizeRounded);

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");

         double importedChocolateTax1 = importedChocolate.getImportTax();
         double importedChocolateTax2 = importedChocolate.getSalesTax();
         double totalImportedChocolateTax = (importedChocolateTax1+importedChocolateTax2)*importedChocolate.itemCost;
         System.out.println("1 "+importedChocolate.itemName+": $"+(importedChocolate.itemCost+totalImportedChocolateTax));

         double importedPerfumeTax1 = importedPerfume.getImportTax();
         double importedPerfumeTax2 = importedPerfume.getSalesTax();
         double totalImportedPerfumeTax = (importedPerfumeTax1+importedPerfumeTax2)*importedPerfume.itemCost;
         System.out.println("1 "+importedPerfume.itemName+": $"+(importedPerfume.itemCost+totalImportedPerfumeTax));

         //SALES TAX
         double grandTotalTax2 = totalImportedChocolateTax +totalImportedPerfumeTax;
         System.out.println("Sales Taxes: "+grandTotalTax2);
         System.out.println("Total: "+ (importedChocolate.itemCost+importedPerfume.itemCost+grandTotalTax2));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");


         //IMPORTED PERFUME
         importedPerfume.itemCost=27.99;
         double importedPerfumeTax1B = importedPerfume.getImportTax();
         double importedPerfumeTax2B = importedPerfume.getSalesTax();
         double totalImportedPerfumeTaxB = (importedPerfumeTax1B+importedPerfumeTax2B)*importedPerfume.itemCost; //needed in calculating grand total
         System.out.println("1 "+importedPerfume.itemName+": $"+(importedPerfume.itemCost+totalImportedPerfumeTaxB));

         //PERFUME
         double PerfumeTax1 = perfume.getImportTax();
         double PerfumeTax2 = perfume.getSalesTax();
         double totalPerfumeTax = (PerfumeTax1+PerfumeTax2)*perfume.itemCost;//needed in calculating grand total
         System.out.println("1 "+perfume.itemName+": $"+(perfume.itemCost+totalPerfumeTax));

         //HEADACHE
         double headTax1 = headache.getImportTax();
         double headTax2 = headache.getSalesTax();
         double totalHeadacheTax = (headTax1+headTax2)*headache.itemCost;//needed in calculating grand total
         System.out.println("1 "+headache.itemName+": $"+(headache.itemCost+totalHeadacheTax));

         //CHOCOLATE
         importedChocolate.itemCost = 11.25;
         double importedChocolateTax1B = importedChocolate.getImportTax();
         double importedChocolateTax2B = importedChocolate.getSalesTax();
         double totalImportedChocolateTaxB = (importedChocolateTax1B+importedChocolateTax2B)*importedChocolate.itemCost;//needed in calculating grand total
         System.out.println("1 "+importedChocolate.itemName+": $"+(importedChocolate.itemCost+totalImportedChocolateTaxB));

         //SALES TAX
         double grandTotalTax2B = totalImportedPerfumeTaxB+totalPerfumeTax+totalImportedChocolateTax +totalHeadacheTax;//SALES TAX GRAND TOTAL
         System.out.println("Sales Taxes: "+grandTotalTax2B);
         System.out.println("Total: "+ (importedPerfume.itemCost+perfume.itemCost+headache.itemCost+importedChocolate.itemCost+grandTotalTax2B));


         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");

      }

   }


}
