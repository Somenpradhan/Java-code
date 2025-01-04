public class BankAccount 
{
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        if (balance < 0) 
        {
            System.out.println("Balanced can't be negative");
        } 
        else 
        {
            this.balance = balance;
        }
    }

    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(12345, 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        
        account.setBalance(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.setBalance(-200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.setBalance(1500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
    }
}