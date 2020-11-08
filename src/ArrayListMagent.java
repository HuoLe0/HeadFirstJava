import java.util.ArrayList;

public class ArrayListMagent {
    public static void main(String [] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printAL(a);
        if (a.contains("three")){
            a.add(4,"four");
        }


        if (a.contains("two")){
            a.remove(2);
            printAL(a);

            a.add("2.2");
        }
        printAL(a);



        if (a.indexOf("four") != 4){
            a.add(4,"4.2");
        }
        printAL(a);
    }

    private static void printAL(ArrayList<String> a1) {
        for (String element : a1){
            System.out.print(element + "  ");
        }
        System.out.println(" ");
    }
}
