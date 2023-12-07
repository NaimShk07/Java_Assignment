package Assignment_Tops.Module_2;

class InsufficientBalanceException extends Exception {
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException();
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance + " Rs.");
        }
    }
}

public class Q30 {
    public static void main(String[] args) {
        try {
            int accountBalance = 2000;
            int withdrawAmount = 2500;

            BankAccount account = new BankAccount(accountBalance);
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Sorry, insufficient balance. You need more funds to perform this transaction.");
        }
    }
}


