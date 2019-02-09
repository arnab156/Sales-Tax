import java.awt.*;
import java.util.Scanner;

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


//      System.out.println(book.getSalesTax());
//      System.out.println("item name is "+ book.itemName);
//
//      System.out.println(chocolate.getSalesTax());
//      System.out.println(chocolate.getImportTax());
//
//
//      System.out.println(CD.getImportTax());
//      System.out.println(importedChocolate.getImportTax());
//
//      System.out.println(importedPerfume.getImportTax());
//
//      System.out.println(perfume.getImportTax());

      System.out.println("Enter number 1,2 or 3 to see each receipt, press any NUMBER to see all receipts: ");
      Scanner input = new Scanner(System.in);
      int userNumber = input.nextInt();
      System.out.println("----------------------START OF--------------------------");
      System.out.println("----------------------OUTPUT#"+userNumber+"--------------------------");

      if (userNumber == 1){
         double bookTax1 = book.getImportTax();
         double bookTax2 = book.getSalesTax();
         double totalBookTax = (bookTax1+bookTax2)*book.itemCost;
         System.out.println("1 "+book.itemName+": $"+(book.itemCost+totalBookTax));

         double CDTax1 = CD.getImportTax();
         double CDTax2 = CD.getSalesTax();
         double totalCDTax = (CDTax1+CDTax2)*CD.itemCost;
         System.out.println("1 "+CD.itemName+": $"+(CD.itemCost+totalCDTax));

         double chocolateTax1 = chocolate.getImportTax();
         double chocolateTax2 = chocolate.getSalesTax();
         double totalChocolateTax = (chocolateTax1+chocolateTax2)*chocolate.itemCost;

         System.out.println("1 "+chocolate.itemName+": $"+(chocolate.itemCost+totalChocolateTax));
         //SALES TAX
         double grandTotalTax = totalBookTax+totalCDTax+totalChocolateTax;
         System.out.println("Sales Taxes: "+grandTotalTax);
         System.out.println("Total: "+ (book.itemCost+totalBookTax +CD.itemCost+totalCDTax+chocolate.itemCost+totalChocolateTax));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");

      } else if (userNumber == 2){
         double importedChocolateTax1 = importedChocolate.getImportTax();
         double importedChocolateTax2 = importedChocolate.getSalesTax();
         double totalImportedChocolateTax = (importedChocolateTax1+importedChocolateTax2)*importedChocolate.itemCost;
         System.out.println("1 "+importedChocolate.itemName+": $"+(importedChocolate.itemCost+totalImportedChocolateTax));

         double importedPerfumeTax1 = importedPerfume.getImportTax();
         double importedPerfumeTax2 = importedPerfume.getSalesTax();
         double totalimportedPerfumeTax = (importedPerfumeTax1+importedPerfumeTax2)*importedPerfume.itemCost;
         System.out.println("1 "+importedPerfume.itemName+": $"+(importedPerfume.itemCost+totalimportedPerfumeTax));

         //SALES TAX
         double grandTotalTax = totalImportedChocolateTax +totalimportedPerfumeTax;
         System.out.println("Sales Taxes: "+grandTotalTax);
         System.out.println("Total: "+ (importedChocolate.itemCost+importedPerfume.itemCost+grandTotalTax));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#2--------------------------");

      } else if (userNumber == 3){
         //IMPORTED PERFUME
         importedPerfume.itemCost=27.99;
         double importedPerfumeTax1 = importedPerfume.getImportTax();
         double importedPerfumeTax2 = importedPerfume.getSalesTax();
         double totalimportedPerfumeTax = (importedPerfumeTax1+importedPerfumeTax2)*importedPerfume.itemCost;
         System.out.println("1 "+importedPerfume.itemName+": $"+(importedPerfume.itemCost+totalimportedPerfumeTax));

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
         double grandTotalTax = totalimportedPerfumeTax+totalPerfumeTax+totalImportedChocolateTax +totalHeadacheTax;
         System.out.println("Sales Taxes: "+grandTotalTax);
         System.out.println("Total: "+ (importedPerfume.itemCost+perfume.itemCost+headache.itemCost+importedChocolate.itemCost+grandTotalTax));

         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");

      } else {

         System.out.println("----------------------START OF--------------------------");
         System.out.println("----------------------OUTPUT#1--------------------------");



         System.out.println("-----------------------END OF---------------------------");
         System.out.println("----------------------OUTPUT#3--------------------------");

      }

   }


}
