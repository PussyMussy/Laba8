package Example9;
import java.io.*;
import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() throws Exception {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\tmp\\f1.txt"), "cp1251"));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\tmp\\f2.txt"), "cp1251"));

            int linesCount = 0;
            String line = "";
            while ((line = reader.readLine()) != null) {
                linesCount++;
                out.printf("%d: %s\n", linesCount, line);
                writer.write(String.format("%d: %s", linesCount, line));
                writer.newLine();
            }
            writer.flush();
        } finally {
            reader.close();
            writer.close();
        }
    }
}
