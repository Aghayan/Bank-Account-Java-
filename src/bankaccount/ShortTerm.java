package bankaccount;

public class ShortTerm extends DepositAccount {
    public ShortTerm() {
    }

    public ShortTerm(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addinterest() {
        float interestRate=1.09f;
        setBalance((long) (getBalance()*interestRate));
    }
}
