package Example3;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import static Example3.Program.readAllByArray;
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\tmp\\f1.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла" + fileName+e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                }
            }}}}