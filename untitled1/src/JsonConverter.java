import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonConverter {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("D:\\programming\\java\\untitled1\\src\\stocks.json");
        String str = Files.readString(fileName);
//        System.out.println(str);
        String[] array = str.split("/s");
        for ( String s : array ){
            System.out.println(s);
        }
    }
}
