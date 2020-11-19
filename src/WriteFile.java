import java.io.FileWriter;

public class WriteFile {
    String text = "Youth/Troye Sivan\n" +
            "如果当时/许嵩\n" +
            "Yummy/Justin Bieber\n" +
            "Last Dance/伍佰\n" +
            "庐州月/许嵩";
    public static void main(String [] args) throws Exception{
        FileWriter writer = new FileWriter("cnm.txt");
        WriteFile writeFile = new WriteFile();
        writer.write(writeFile.text);
        writer.close();
    }
}
