package Module3_basic_Methods_abd_OOP;

public class program6
{
    String accountNumber;
    double balance;


    program6(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }
    public static void main(String[] args) {

        program6 acc = new program6("12345", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Account: " + acc.accountNumber);
        System.out.println("Balance: " + acc.balance);
    }
}

