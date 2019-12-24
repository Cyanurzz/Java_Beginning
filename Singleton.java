public class Singleton {

    private static Singleton instance;
    
    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    private Bank bank;

    public void openAccount(int value) {
        bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}