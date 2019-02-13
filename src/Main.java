import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {


        //USER WILL INPUT NUMBERS TO SEE EITHER RECEIPT #1, #2 OR #3.
        //ONLY ACCEPTABLE INPUT IS A WHOLE INTEGER NUMBER
        System.out.println("Enter number 1,2 or 3 to see each output/receipt or enter any other number to see all outputs together:");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        System.out.println("---------------------- YOUR INPUT#----------------------");
        System.out.println("---------------------------"+userNumber+"----------------------------");


        String line;
        String item;
        double cost;
        boolean salesTaxExempt;
        boolean imported;
        String[] info;
        double tax = 0;
        double ticket = 0;
        BufferedReader br = null;


        if (userNumber == 1){

            try {
                br = new BufferedReader(new FileReader("resources/input.txt"));

                while ((line = br.readLine()) != null) {
                    info  = line.split(",");    //, would be the delimiter
                    item = info[0];
                    cost = Double.parseDouble(info[(1)]);
                    salesTaxExempt = Boolean.parseBoolean(info[(2)]);
                    imported = Boolean.parseBoolean(info[(3)]);
                    Items product = new Items(item,cost,salesTaxExempt,imported);
                    product.getCostPlusTax();
                    tax = tax + product.getTotalTax();
                    ticket = ticket+ product.itemCost;
                }
                System.out.println("Sales Taxes: $"+String.format("%.2f",tax));
                System.out.println("Total: $"+ df2.format(ticket+tax));
                System.out.println("-----------------------END OF---------------------------");
                System.out.println("----------------------OUTPUT#"+ userNumber+"--------------------------");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }


        } //END OF #1

        else if (userNumber == 2) {
//            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("resources/input_2.txt"));

                while ((line = br.readLine()) != null) {
                    info  = line.split(",");    //, would be the delimiter
                    item = info[0];
                    cost = Double.parseDouble(info[(1)]);
                    salesTaxExempt = Boolean.parseBoolean(info[(2)]);
                    imported = Boolean.parseBoolean(info[(3)]);
                    Items product = new Items(item,cost,salesTaxExempt,imported);
                    product.getCostPlusTax();
                    tax = tax + product.getTotalTax();
                    ticket = ticket+ product.itemCost;
                }
                System.out.println("Sales Taxes: $"+String.format("%.2f",tax));
                System.out.println("Total: $"+ df2.format(ticket+tax));
                System.out.println("-----------------------END OF---------------------------");
                System.out.println("----------------------OUTPUT#"+ userNumber+"--------------------------");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }

        } //END OF OUTPUT#2
        else if (userNumber == 3){

            try {
                br = new BufferedReader(new FileReader("resources/input_3.txt"));

                while ((line = br.readLine()) != null) {
                    info  = line.split(",");    //, would be the delimiter
                    item = info[0];
                    cost = Double.parseDouble(info[(1)]);
                    salesTaxExempt = Boolean.parseBoolean(info[(2)]);
                    imported = Boolean.parseBoolean(info[(3)]);
                    Items product = new Items(item,cost,salesTaxExempt,imported);
                    product.getCostPlusTax();
                    tax = tax + product.getTotalTax();
                    ticket = ticket+ product.itemCost;
                }
                System.out.println("Sales Taxes: $"+String.format("%.2f",tax));
                System.out.println("Total: $"+ df2.format(ticket+tax));
                System.out.println("-----------------------END OF---------------------------");
                System.out.println("----------------------OUTPUT#"+ userNumber+"--------------------------");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }

        }
        else {

            try {
                br = new BufferedReader(new FileReader("resources/input_1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("resources/input_2.txt"));
                BufferedReader br3 =new BufferedReader(new FileReader("resources/input_3.txt"));
                double tax2 = 0;
                double ticket2 = 0;
                double tax3 = 0;
                double ticket3 = 0;

                System.out.println("-----------------------START OF---------------------------");
                System.out.println("----------------------OUTPUT#1 ---------------------------");
                while ((line = br.readLine()) != null) {
                    info  = line.split(",");    //, would be the delimiter
                    item = info[0];
                    cost = Double.parseDouble(info[(1)]);
                    salesTaxExempt = Boolean.parseBoolean(info[(2)]);
                    imported = Boolean.parseBoolean(info[(3)]);
                    Items product = new Items(item,cost,salesTaxExempt,imported);
                    product.getCostPlusTax();
                    tax = tax + product.getTotalTax();
                    ticket = ticket+ product.itemCost;
                }

                System.out.println("Sales Taxes: $"+String.format("%.2f",tax));
                System.out.println("Total: $"+ df2.format(ticket+tax));
                System.out.println("-----------------------END OF---------------------------");
                System.out.println("----------------------OUTPUT#1--------------------------");



                System.out.println("-----------------------START OF---------------------------");
                System.out.println("----------------------OUTPUT#2 ---------------------------");
                while ((line = br2.readLine()) != null) {
                    info  = line.split(",");    //, would be the delimiter
                    item = info[0];
                    cost = Double.parseDouble(info[(1)]);
                    salesTaxExempt = Boolean.parseBoolean(info[(2)]);
                    imported = Boolean.parseBoolean(info[(3)]);
                    Items product = new Items(item,cost,salesTaxExempt,imported);
                    product.getCostPlusTax();
                    tax2 = tax2 + product.getTotalTax();
                    ticket2 = ticket2+ product.itemCost;
                }
                System.out.println("Sales Taxes: $"+String.format("%.2f",tax2));
                System.out.println("Total: $"+ df2.format(ticket2+tax2));
                System.out.println("-----------------------END OF---------------------------");
                System.out.println("----------------------OUTPUT#2--------------------------");


                System.out.println("-----------------------START OF---------------------------");
                System.out.println("-----------------------OUTPUT#3---------------------------");
                while ((line = br3.readLine()) != null) {
                    info  = line.split(",");    //, would be the delimiter
                    item = info[0];
                    cost = Double.parseDouble(info[(1)]);
                    salesTaxExempt = Boolean.parseBoolean(info[(2)]);
                    imported = Boolean.parseBoolean(info[(3)]);
                    Items product = new Items(item,cost,salesTaxExempt,imported);
                    product.getCostPlusTax();
                    tax3 = tax3 + product.getTotalTax();
                    ticket3 = ticket3+ product.itemCost;
                }

                System.out.println("Sales Taxes: $"+String.format("%.2f",tax3));
                System.out.println("Total: $"+ df2.format(ticket3+tax3));
                System.out.println("-----------------------END OF---------------------------");
                System.out.println("----------------------OUTPUT#3--------------------------");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }


    }

}