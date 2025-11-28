public class Main {

    public static void main(String[] args) {

        SimpleAccount debetAc = new SimpleAccount();
        CreditAccount creditAc = new CreditAccount(50_000);

        add(debetAc, 10_000);
        pay(debetAc, 5_000);
        transfer(creditAc, debetAc, 5_000);

        System.out.println(debetAc.getBalance());
        System.out.println(creditAc.getBalance());


    }

    public static void add(Account account, long amount){
        account.add(amount);
    }

    public static void pay(Account account, long amount){
        account.pay(amount);
    }

    public static void transfer(Account accountFrom, Account accountTo, long amount){
        accountFrom.transfer(accountTo, amount);
    }
}