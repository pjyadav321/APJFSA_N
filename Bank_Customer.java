class BankCustomer {
    // Fields for account number, account type, and amount
    private int acno;
    private String atype;
    private double amt;

    // Constructor with all fields
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Constructor with account number and account type, default amount to zero
    public BankCustomer(int acno, String atype) {
        this(acno, atype, 0.0);
    }

    // Constructor with account number only, default account type to "Savings" and amount to zero
    public BankCustomer(int acno) {
        this(acno, "Savings", 0.0);
    }

    // Method to display customer details
    public void displayCustomerInfo() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    public static void main(String[] args) {
        // Creating customer with all parameters
        BankCustomer customer1 = new BankCustomer(101, "Checking", 5000.0);
        // Creating customer with account number and type, amount defaults to 0
        BankCustomer customer2 = new BankCustomer(102, "Savings");
        // Creating customer with only account number, type defaults to Savings and amount to 0
        BankCustomer customer3 = new BankCustomer(103);

        // Displaying customer information
        System.out.println("Customer 1 Info:");
        customer1.displayCustomerInfo();

        System.out.println("\nCustomer 2 Info:");
        customer2.displayCustomerInfo();

        System.out.println("\nCustomer 3 Info:");
        customer3.displayCustomerInfo();
    }
}

/*
    OUTPUT:
    Customer 1 Info:
    Account Number: 101
    Account Type: Checking
    Amount: 5000.0

    Customer 2 Info:
    Account Number: 102
    Account Type: Savings
    Amount: 0.0

    Customer 3 Info:
    Account Number: 103
    Account Type: Savings
    Amount: 0.0
 */