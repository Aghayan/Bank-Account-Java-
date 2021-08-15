package bankaccount.main;


import bankaccount.*;

public class Main {
    public static void main(String[] args) {
        //CurrentAccount acc1 = new CurrentAccount(1 , "AmirMuhammad" , 1000000);
        // ShortTerm acc2 = new ShortTerm(2,"hossin" , 103243);

        BankAccount [] accounts = {
                new CurrentAccount(1 , "AmirMuhammad" , 1000000),
                new ShortTerm(2 , "Amir" , 1000),
                new LongTerm(2 , "Muhammad" , 4000),
        };

        BankAccountService service = new BankAccountService();
        service.runInterest(accounts);

        for(BankAccount ba : accounts){
            System.out.println(ba.getClass().getName() + " : " + ba.getBalance() );
        }
    }
}
