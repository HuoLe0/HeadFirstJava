public class GuessGame {
    void startGame(){
        int traget = (int) (Math.random() * 10);
        System.out.println("Guess the number ?");
        Player one = new Player();
        Player two = new Player();
        Player three = new Player();

        boolean flag = false;
        boolean g1right = false;
        boolean g2right = false;
        boolean g3right = false;
        while (!flag){
            System.out.print("Player one: ");
            one.guessNum();
            int g1 = one.n;
            System.out.print("Player two: ");
            two.guessNum();
            int g2 = two.n;
            System.out.print("Player three: ");
            three.guessNum();
            int g3 = three.n;
            if (g1 == traget ||g2 == traget || g3 == traget){
                flag = true;
                if (g1 == traget){
                    g1right = true;
                }
                else if (g2 == traget){
                    g2right = true;
                }
                else if (g3 == traget){
                    g3right = true;
                }
            }
            else {
                System.out.println("Wrong Number,please try again！");
            }

        }
        System.out.println("YES! the number is: "+traget);
        if (g1right){
            System.out.println("Player one got it right!");
        }
        if (g2right){
            System.out.println("Player two got it right!");
        }
        if (g3right){
            System.out.println("Player three got it right!");
        }
    }
}
