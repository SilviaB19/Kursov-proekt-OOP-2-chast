import java.io.*;
import java.io.IOException;
public class CreateFileExample {
    public static void main(String[] args) throws IOException {

        DataInputStream d = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("D:\\newfile.txt");
        System.out.print("Enter text(@ at the end):");
        char ch;
        while ((ch = (char) d.read()) != '@')
            fout.write(ch);
        fout.close();

        try (FileReader reader = new FileReader("D:\\newfile.txt")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
