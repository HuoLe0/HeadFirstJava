public class MyRunnable implements Runnable {
        public void run() {
            go();
        }

        private void go() {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            doMore();
        }

        private void doMore() {
            System.out.println("top o' the stack");
        }
}
