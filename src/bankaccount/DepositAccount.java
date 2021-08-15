package bankaccount;

public abstract class DepositAccount extends BankAccount{
    public DepositAccount() {
    }

    public DepositAccount(int number, String owner, long balance) {
        super(number, owner, balance);
    }
}
