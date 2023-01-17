package Example3;

import java.io.FileInputStream;
import java.io.InputStream;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() throws Exception {
        var fileName = "C:\\tmp\\text.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream("C:\\tmp\\text.txt");
            Program.readAllByByteToConsole(inFile);
        } finally {
            if (inFile != null) inFile.close();
        }
    }
}
