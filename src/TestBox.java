import java.util.Date;

public class TestBox {
    Integer i;
    int j;
    String s = "2";
    int x = Integer.parseInt(s);
    double d = Double.parseDouble("420000000.21");

    boolean b = new Boolean("true").booleanValue();

    String doubleString = "" + d;
    String doubleString1 = Double.toString(d);
    String z = String.format("%, d",100000000);

    String date = String.format("%tr",new Date());

    public static void main(String [] args){
        TestBox t = new TestBox();
        t.go();
    }

    private void go() {
        i = j;
        System.out.println(j);
        System.out.println(i);
        System.out.println(date);

    }
}
