import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Jukebox6 {
    ArrayList<Jukebox6.Song> songList = new ArrayList<Jukebox6.Song>();
    public static void main(String [] args){
        new Jukebox6().go();
    }

    class ArtistCompare implements Comparator<Jukebox6.Song> {
        public int compare(Jukebox6.Song one, Jukebox6.Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song> songTreeSet = new TreeSet<Song>();
        songTreeSet.addAll(songList);
        System.out.println(songTreeSet);

        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
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
        Jukebox6.Song nextSong = new Jukebox6.Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    private class Song implements Comparable<Jukebox6.Song> {
        String title;
        String artist;
        String rating;
        String bpm;

        public boolean equals(Object aSong){
            Song s = (Song) aSong;
            return getTitle().equals(s.getTitle());
        }

        public int hashCode(){
            return title.hashCode();
        }

        public int compareTo(Jukebox6.Song s){
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
