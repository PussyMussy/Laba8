package Example8;
import java.io.*;
import java.net.URL;
import static Example8.Program.readAllByByte;
public class Main {
    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("E:\\MyFile1.txt"); // байтовый
            Reader rFile= new InputStreamReader(inFile,"cp1251"); // символьный
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
            InputStream inUrl = new URL("http://google.com").openStream(); // байтовый
            Reader rUrl=new InputStreamReader(inUrl, "cp1251"); // символьный
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
            InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11});
            Reader rArray=new InputStreamReader(inArray,"cp1251" ); // символьный
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: "+ e);
        }
    }}

