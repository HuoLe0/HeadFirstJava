public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;
    int temp = 0;
    public void setLocationCells(int [] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells){
            if (guess == cell) {
                if (guess != temp){
                    result = "hit";
                    numOfHits++;
                    temp = guess;
                    break;
                }
                else {
                    result = "the Dot has already be killed,try another one";
                }
            }

        }
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
