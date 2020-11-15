import java.io.FileWriter;

public class WriteFile {
    String text = "草泥马";
    public static void main(String [] args) throws Exception{
        FileWriter writer = new FileWriter("cnm.txt");
        WriteFile writeFile = new WriteFile();
        writer.write(writeFile.text);
        writer.close();
    }
}
