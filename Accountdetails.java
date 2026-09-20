class Account {
    int accNo;
    String name;
    String address;
    double balance;

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAcc extends Account {
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdrawal(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void FD() {
        System.out.println("Fixed Deposit created");
    }

    void payment() {
        System.out.println("Payment successful");
    }
}

class LoanAcc extends Account {
    void interest() {
        System.out.println("Interest calculated");
    }

    void EMI() {
        System.out.println("EMI calculated");
    }
}

public class Accountdetails {
    public static void main(String[] args) {
        SavingsAcc s = new SavingsAcc();
        LoanAcc l = new LoanAcc();
        s.accNo = 101;
        s.name = "Dharshu";
        s.address = "Salem";
        s.balance = 10000;

        s.display();
        s.deposit(5000);
        s.withdrawal(2000);
        s.FD();
        s.payment();
        System.out.println();
        l.accNo = 201;
        l.name = "Dharshu";
        l.balance = 50000;
        l.interest();
        l.EMI();
    }
}