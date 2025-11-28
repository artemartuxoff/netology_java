public class SimpleAccount extends Account {

    public SimpleAccount() {
        super(0);
    }

    @Override
    public boolean add(long amount) {
        this.balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {

        if (this.balance > amount) {
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
