public class Player {
    int n = 0;
        public void guessNum() {
            n = (int) (Math.random() * 10);
            System.out.println("I guess the number is:"+n);
        }
}
