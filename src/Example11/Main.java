package Example11;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        try {
            var scan = new Scanner(in);
            var lines = new String[2];
            var doubles = new Double[5];
            for (int i = 0; i < lines.length; i++) {
                out.print("Введите строку символов: ");
                lines[i] = scan.nextLine();
            }
            for (int i = 0; i < doubles.length; i++) {
                out.print("Введите число: ");
                doubles[i] = scan.nextDouble();
            }
            Program.FileWriteArray("C:\\tmp\\f1.txt", false, lines);
            Program.FileWriteArray("C:\\tmp\\f1.txt", true, doubles);
            var fileInfo = Program.FileReadArray("C:\\tmp\\f1.txt");
            Program.FileWrite("C:\\tmp\\f2.txt", false, fileInfo.get(1));
            var subFileInfo = fileInfo.subList(2, fileInfo.size());
            for (String line: subFileInfo) {
                try {
                    var number = Double.valueOf(line);
                    if (number > 0)
                        Program.FileWrite("C:\\tmp\\f2.txt", true, number);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
}
