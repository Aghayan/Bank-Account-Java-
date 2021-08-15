package bankaccount;

public class BankAccountService {

    public void transfer(BankAccount acc1 , BankAccount acc2 , long amount){
        acc1.withdraw(amount);
        acc2.deposite(amount);
    }

    public void runInterest(BankAccount[]list){
        for(BankAccount ba:list)
            ba.addinterest();
    }
}
