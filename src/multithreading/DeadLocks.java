package multithreading;

import javax.naming.InsufficientResourcesException;

public class DeadLocks {
    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(a, b, 500);
                } catch (InsufficientResourcesException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            transfer(b, a, 300);
        } catch (InsufficientResourcesException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void transfer(Account acc1, Account acc2, int amount)
            throws InsufficientResourcesException, InterruptedException {
        if(acc1.getBalance()<amount)
            throw new InsufficientResourcesException();

        synchronized (acc1){
            Thread.sleep(1000L);
            synchronized (acc2){

                acc1.withdraw(amount);
                acc2.deposit(amount);
            }
        }

        System.out.println("transfer successful! acc1="
                +acc1.getBalance()+" acc2="+acc2.getBalance());
    }


}
