package Example2;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import static Example2.Program.readAllByByte;
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream("c:/tmp/text/txt");
            readAllByByte(inFile);
System.out.print("\n\n\n");
inFile.close();
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();
            InputStream inArray=new ByteArrayInputStream(new byte [] {7,9,3,7,4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: "+ e);
        }
    }
    }
