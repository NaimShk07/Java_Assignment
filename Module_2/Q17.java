package Assignment_Tops.Module_2;

abstract class Bank {
    public abstract void getBalance();
}

class BankA extends Bank {
    private int balance = 100;
    @Override
    public void getBalance() {
        System.out.println("Balance in Bank A: $" + balance);
    }
}

class BankB extends Bank {
    private int balance = 150;
    @Override
    public void getBalance() {
        System.out.println("Balance in Bank B: $" + balance);
    }
}

class BankC extends Bank {
    private int balance = 200;
    @Override
    public void getBalance() {
        System.out.println("Balance in Bank C: $" + balance);
    }
}

public class Q17 {
    public static void main(String[] args) {
        // creating objects of subclass
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        // calling getbalance method of each bank
        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();

    }
}
