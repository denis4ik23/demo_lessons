package thread_test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bank {

    private ConcurrentMap<Long, Account> accMap = new ConcurrentHashMap<>();

    public void changeAmount(long accId, double amount){
        synchronized (lock) {
            if (amount > balanceAmount) {
                throw new IllegalArgumentException(
                        "Transfer cannot be completed");
            }
            accId.balanceAmount += amount;
            this.balanceAmount -= amount;
        }
    }

    public void transfer Money(long srcAccId, long dstAccId, double amount){
        Thread transfer = new Thread(new Runnable() {
            @Override public void run() {
                srcAccId.changeAmount(dstAccId, amount);
            }
        });
        transfer.start();
}
    }

    class Account{
        private long id;
        private double amount;
        private long userId;
        private boolean blocked;
    }
}
