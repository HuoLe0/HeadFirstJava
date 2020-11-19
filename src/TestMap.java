import java.util.HashMap;

public class TestMap {
    public static void main(String[] args){
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Kathy", 42);
        scores.put("侯靖琳", 420);
        scores.put("候大傻", 343);

        System.out.println(scores);
        System.out.println(scores.get("侯靖琳"));
    }
}
