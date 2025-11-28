import java.time.LocalDateTime;

public abstract class Account  {

    public long balance;
    public long creditLimit;

    public Account(long creditLimit){
        this.creditLimit = -1*creditLimit;
    }
    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public abstract boolean transfer(Account account, long amount);

    public long getBalance(){

        return this.balance;
    }


}
