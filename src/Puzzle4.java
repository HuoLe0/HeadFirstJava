public class Puzzle4 {
    public static void main(String [] args){
        Puzzle4 [] obs = new Puzzle4[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4();
            y = y * 10;
            x = x + 1;
        }
        x = 6;
        while (x > 0){
            x = x - 1;
            result = result + 1;
        }
        System.out.println("result "+ result);
    }
}
class Puzzle4b {
    int ivar;
    public int doStuff(int ivar){
        if (ivar > 100){
            return ivar;
        } else {
            return ivar;
        }
    }
}
