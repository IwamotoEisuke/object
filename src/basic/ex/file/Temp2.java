package basic.ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) {
        String first = ".src/basic/ex/file";
        String fileName = "temp.txt";
        Path path = Path.of(first, fileName);
        if (Files.exists(path)) {
            List<String> list  = new ArrayList<>();
            list.addAll(Arrays.asList("あいうえお","かきくけこ","さしすせそ"));
            try {
                Files.write(path, list);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}
