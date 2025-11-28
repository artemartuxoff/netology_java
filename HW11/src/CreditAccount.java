public class CreditAccount extends Account {

    public CreditAccount(long creditLimit) {
        super(creditLimit);
    }

    @Override
    public boolean add(long amount) {

        if (this.balance + amount > 0) {
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {

        if (this.balance - amount > this.creditLimit) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            return account.add(amount);
        } else {
            return false;
        }
    }
}
