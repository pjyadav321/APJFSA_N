
//Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor
public class BankCustomer {
     int acNo;
     String aType;
     float amt;
//Parameterized constructor
    public BankCustomer(int acNo, String aType, float amt) {
        this.acNo = acNo;
        this.aType = aType;
        this.amt = amt;
    }

    // Setter and getter for acNo
    public int getAcNo() {
        return acNo;
    }

    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    // Setter and getter for aType
    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    // Setter and getter for amt
    public float getAmt() {
        return amt;
    }

    public void setAmt(float amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "Account Number =" + acNo +
                ", Account Type ='" + aType + '\'' +
                ", Amount =" + amt +
                '}';

    }
}