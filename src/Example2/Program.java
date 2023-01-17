package Example2;
import java.io.IOException;
import java.io.InputStream;
public class Program {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }}