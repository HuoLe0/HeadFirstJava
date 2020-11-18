public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();//任务初始化
        Thread one = new Thread(theJob);//创建相同任务的两个线程
        Thread two = new Thread(theJob);

        one.setName("大傻");
        two.setName("二傻");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            int a = (int) (Math.random() * 10);
            makeWithdraw(a);
            if (account.getBalance() < 0) {
                System.out.println("没钱了，滚吧!");
            }
        }
    }

    private synchronized void makeWithdraw(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + "准备取钱");
            try {
                System.out.println(Thread.currentThread().getName() + "先睡一觉");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "醒了");
            System.out.println(Thread.currentThread().getName() + "取了" + amount +"万");
            account.withdraw(amount);
        } else {
            System.out.println("别取了" + Thread.currentThread().getName() + "，真的一分钱都没了");
        }
    }

}
