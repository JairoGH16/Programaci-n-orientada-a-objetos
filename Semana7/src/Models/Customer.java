package Models;

public class Customer extends Person {
    private String accountNumber;

    public Customer(String id, String Firstname,String Lastname, String accountNumber ) {
        super(Firstname, Lastname);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
