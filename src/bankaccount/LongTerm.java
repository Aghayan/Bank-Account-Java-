package bankaccount;

public class LongTerm extends DepositAccount {
    public LongTerm() {
    }

    public LongTerm(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addinterest() {
        float interestRate=1.24f;
        setBalance((long) (getBalance()*interestRate));
    }
}
