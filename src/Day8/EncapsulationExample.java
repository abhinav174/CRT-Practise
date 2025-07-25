package Day8;

class BankAccount{
    private String accountNumber;
    private double balance;

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String NewAccountNumber)
    {
        accountNumber = NewAccountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double newBalance)
    {
        if(newBalance >= 0)
        {
            balance = newBalance;
        }
        else {
//            balance = balance;
            System.out.println("Invalid Balance");
        }
    }
}

public class EncapsulationExample {
    public static void main(String args[] )
    {
        BankAccount b = new BankAccount();

        b.setAccountNumber("ABC123");
        b.setBalance(1000);

        b.setBalance(-1000);

        System.out.println("The Account Number: "+b.getAccountNumber());
        System.out.println("The Balance: "+b.getBalance());
    }
}
