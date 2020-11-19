import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {
    ArrayList<Song> songList = new ArrayList<Song>();
    public static void main(String [] args){
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);

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
        String[] tokens = line.split("/");
        Jukebox5.Song nextSong = new Jukebox5.Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    private class Song implements Comparable<Jukebox5.Song> {
        String title;
        String artist;
        String rating;
        String bpm;

        public int compareTo(Jukebox5.Song s){
            return title.compareTo(s.getTitle());
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public String getRating() {
            return rating;
        }

        public String getBpm() {
            return bpm;
        }



        Song(String t, String a, String r, String b){
            title = t;
            artist = a;
            rating = r;
            bpm = b;
        }

        public String toString(){
            return title;
        }
    }
}
