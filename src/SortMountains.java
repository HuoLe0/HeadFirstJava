import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    private class Mountain {
        String name;
        int height;
        public Mountain(String n, int h){
            name = n;
            height = h;
        }

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }
        public String toString(){
            return name+ " " + height;
        }
    }

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();
    class NameCompare implements Comparator<Mountain>{

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }
    class HeightCompare implements Comparator<Mountain>{

        @Override
        public int compare(Mountain one, Mountain two) {
            return (one.getHeight() - (two.getHeight()));
        }
    }

    public static void main(String [] args){
        new SortMountains().go();
    }

    private void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("as entered:\n"+ mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn,nc);
        System.out.println("by name:\n"+ mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn,hc);
        System.out.println("be height:\n"+ mtn);
    }
}



















