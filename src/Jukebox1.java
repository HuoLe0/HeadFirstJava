import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.FileHandler;

public class Jukebox1 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args){
        new Jukebox1().go();
    }

    private void go() {
        getSongs();
        Collections.sort(songList);
        System.out.println(songList);
    }

    private void getSongs() {
        try {
            File file = new File("cnm.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        } catch (Exception ex){ex.printStackTrace();}
    }

    private void addSong(String line) {
        String line1 = line.replace("/","--");
        songList.add(line1);
    }
}
