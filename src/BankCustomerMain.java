public class BankCustomerMain {
    // Main class to display the details of Customer
    public static void  main(String args[]){

        //Creating bankCustomer Object using parameterized customer
        BankCustomer b = new BankCustomer(1200734565, "Saving", 456342.60f);

        // Print each fields individually
        System.out.println("Account Number: " +b.acNo);
        System.out.println("Account Type: " +b.aType);
        System.out.println("Total amount: " + b.amt);

    }
}

/*

    OUTPUT:
    Account Number: 1200734565
    Account Type: Saving
    Total amount: 456342.6
 */
