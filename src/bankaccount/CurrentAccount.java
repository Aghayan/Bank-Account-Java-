package bankaccount;

public class CurrentAccount extends BankAccount{

    public CurrentAccount() {
    }

    public CurrentAccount(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addinterest() {

    }
}
