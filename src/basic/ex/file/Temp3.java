package basic.ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Temp3 {
    public static void main(String[] args) {
        String first = ".src/basic/ex/file";
        String fileName = "temp.txt";
        Path path = Path.of(first, fileName);
        if (Files.notExists(path)) {
            System.out.println("読み込み対象のファイル" + path + " is not exist");
        }
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
