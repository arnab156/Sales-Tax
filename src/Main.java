import java.awt.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.text.DecimalFormat;

public class Main {

   private static DecimalFormat df2 = new DecimalFormat(".##");

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
      System.out.println("Enter number 1,2 or 3 to see each receipt, enter any OTHER NUMBER to see all receipts: ");
      Scanner input = new Scanner(System.in);
      int userNumber = input.nextInt();
      System.out.println("--------------------NUMBER ENTERED:---------------------");
      System.out.println("---------------------------"+userNumber+"----------------------------");

      if (userNumber == 1){

         //BOOK
         double bookTax = book.getTotalTax(); //total tax (sales + import) for this item, which ever is applicable
         book.getCostPlusTax(); //PRINT PRICE OF THE ITEM WITH TAXES

         //CD
         double totalCDTax = CD.getTotalTax();
         CD.getCostPlusTax();

         //CHOCOLATE
         double totalChocolateTax = chocolate.getTotalTax();
         chocolate.getCostPlusTax();

         //SALES TAX CALCULATION
         double grandTotalTax = bookTax+totalCDTax+totalChocolateTax;
         System.out.println("Sales Taxes: $"+grandTotalTax);

         //TOTAL AMOUNT ON TICKET
         double ticketSize = book.itemCost+CD.itemCost+chocolate.itemCost+grandTotalTax;
         System.out.println("Total: $"+ df2.format(ticketSize));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");

      } else if (userNumber == 2){
         //IMPORTED CHOCOLATE
         double totalImportedChocolateTax = importedChocolate.getTotalTax();
         importedChocolate.getCostPlusTax();

         //IMPORTED PERFUME
         double totalImportedPerfumeTax = importedPerfume.getTotalTax();
         importedPerfume.getCostPlusTax();

         //SALES TAX CALCULATION
         double grandTotalTax = totalImportedChocolateTax +totalImportedPerfumeTax;
         System.out.println("Sales Taxes: $"+grandTotalTax);
         System.out.println("Total: $"+ (importedChocolate.itemCost+importedPerfume.itemCost+grandTotalTax));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");

      } else if (userNumber == 3){
         //IMPORTED PERFUME
         importedPerfume.itemCost=27.99;
         double totalImportedPerfumeTax = importedPerfume.getTotalTax();
         importedPerfume.getCostPlusTax();

         //PERFUME
         double totalPerfumeTax = perfume.getTotalTax();
         perfume.getCostPlusTax();

         //HEADACHE
         double totalHeadacheTax =  headache.getTotalTax();
         headache.getCostPlusTax();

         //CHOCOLATE
         importedChocolate.itemCost = 11.25; //new price for imported chocolate.
         double totalImportedChocolateTax = importedChocolate.getTotalTax();

         //CALCULATION DOES NOT MATCH THE QUESTION  -  calculations are correct.
         importedChocolate.getCostPlusTax();

         //SALES TAX
         double grandTotalTax_3 = totalImportedPerfumeTax+totalPerfumeTax+totalImportedChocolateTax +totalHeadacheTax;
         System.out.println("Sales Taxes: $"+df2.format(grandTotalTax_3));
         System.out.println("Total: $"+ (importedPerfume.itemCost+perfume.itemCost+headache.itemCost+importedChocolate.itemCost+grandTotalTax_3 ));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");

      } else {

         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");
         //BOOK
         double bookTax = book.getTotalTax(); //total tax (sales + import) for this item, which ever is applicable
         book.getCostPlusTax(); //PRINT PRICE OF THE ITEM WITH TAXES

         //CD
         double totalCDTax = CD.getTotalTax();
         CD.getCostPlusTax();

         //CHOCOLATE
         double totalChocolateTax = chocolate.getTotalTax();
         chocolate.getCostPlusTax();

         //SALES TAX CALCULATION
         double grandTotalTax = bookTax+totalCDTax+totalChocolateTax;
         System.out.println("Sales Taxes: $"+grandTotalTax);

         //TOTAL AMOUNT ON TICKET
         double ticketSize = book.itemCost+CD.itemCost+chocolate.itemCost+grandTotalTax;
         System.out.println("Total: $"+ df2.format(ticketSize));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("---------------------THANK YOU--------------------------");
         System.out.println("--------------------FOR SHOPPING------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");
         //IMPORTED CHOCOLATE
         double totalImportedChocolateTax = importedChocolate.getTotalTax();
         importedChocolate.getCostPlusTax();

         //IMPORTED PERFUME
         double totalImportedPerfumeTax = importedPerfume.getTotalTax();
         importedPerfume.getCostPlusTax();

         //SALES TAX CALCULATION
         double grandTotalTax_2 = totalImportedChocolateTax +totalImportedPerfumeTax;
         System.out.println("Sales Taxes: $"+grandTotalTax_2);
         System.out.println("Total: $"+ (importedChocolate.itemCost+importedPerfume.itemCost+grandTotalTax_2));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("---------------------THANK YOU--------------------------");
         System.out.println("--------------------FOR SHOPPING------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");

         //IMPORTED PERFUME
         importedPerfume.itemCost=27.99;
         double totalImportedPerfumeTax_2 = importedPerfume.getTotalTax();
         importedPerfume.getCostPlusTax();

         //PERFUME
         double totalPerfumeTax = perfume.getTotalTax();
         perfume.getCostPlusTax();

         //HEADACHE
         double totalHeadacheTax =  headache.getTotalTax();
         headache.getCostPlusTax();

         //CHOCOLATE
         importedChocolate.itemCost = 11.25; //new price for imported chocolate.
         double totalImportedChocolateTax_2 = importedChocolate.getTotalTax();
         //CALCULATION DOES NOT MATCH THE QUESTION  -  calculations are correct.
         importedChocolate.getCostPlusTax();

         //SALES TAX
         double grandTotalTax_3 = totalImportedPerfumeTax_2+totalPerfumeTax+totalImportedChocolateTax_2 +totalHeadacheTax;
         System.out.println("Sales Taxes: $"+df2.format(grandTotalTax_3));
         System.out.println("Total: $"+ (importedPerfume.itemCost+perfume.itemCost+headache.itemCost+importedChocolate.itemCost+grandTotalTax_3 ));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("--------------------------------------------------------");
         System.out.println("---------------------THANK YOU--------------------------");
         System.out.println("--------------------FOR SHOPPING------------------------");
      }

   }


}
