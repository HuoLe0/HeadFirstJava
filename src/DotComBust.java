import java.util.ArrayList;

public class DotComBust {

    /**
     * 声明初始化变量
     */
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
//        first make some dot coms and give them locations
        /**
         * 创建3个DotCom对象并指派名称并置入Arraylist
         */
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        /**
         * 列出简短提示
         */
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComsList){ //对List中的每一个DotCom重复一次
            ArrayList<String> newLocation = helper.placeDotCom(3); //声明初始化变量
            dotComToSet.setLocationCells(newLocation); //要求DotCom的位置
        }
    }

    private void startPlaying(){
        while (!dotComsList.isEmpty()){ //判断DotCom的list是否为空
            String userGuess = helper.getUserInput("Enter a guess");//取得玩家输入
            checkUserGuess(userGuess); //调用checkUserGuess方法
        }
        finishGame(); //调用finishGame方法
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18){
            System.out.println("It only took you "+ numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        }else {
            System.out.println("Took you long enough "+ numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++; //递增玩家猜测次数的计数
        String result = "miss"; //先假设没有命中

        for (DotCom dotComToTest : dotComsList){ //对list中的所有DotCom重复
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String [] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
