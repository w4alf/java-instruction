import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        
        int numberOfInvoices = 0;
        double avgDiscountAmount = 0.0;
        double avgInvoiceAmount = 0.0;
        double discountAmountTotal = 0.0;
        double invoiceAmountTotal = 0.0;		
        
        
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            //count the number of invoices
            numberOfInvoices += 1;
            
            
            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else if (subtotal >= 500) {
                discountPercent = .25;
            } else {
                discountPercent = 0.0;
            }
            
            
            
            double discountAmount = subtotal * discountPercent;
            
            // total the discount amount
            discountAmountTotal = discountAmountTotal + discountAmount;
            
            double total = subtotal - discountAmount;
            
            //total the invoice amount
            invoiceAmountTotal = invoiceAmountTotal + total;
            		
            
            
           
            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            
            	  System.out.print("Continue? (y/n): ");
                  choice = sc.next();
                  System.out.println();
                 
        }
        
        avgDiscountAmount = discountAmountTotal/numberOfInvoices;
        avgInvoiceAmount = invoiceAmountTotal/numberOfInvoices;
        
        
        // display the discount amount and total
        String message2 = "Number of Invoices: " + numberOfInvoices + "\n"
                       + "Avg. Discount Amount:  " + avgDiscountAmount +" Percent" + "\n"
                       + "Avg. Invoice Amount:    " + avgInvoiceAmount + " Dollars" + "\n";            
        System.out.println(message2);
        
       
    }
}