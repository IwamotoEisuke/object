package basic.ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Temp1 {
    public static void main(String[] args) throws IOException {
        question1();
    }
    /**
     * ファイルの新規作成
     */
    public static void question1() {
        String first = "./src/basic/ex/file";
        String fileName = "temp.txt";
        if (Files.notExists(Path.of(first, fileName))) {
            try {
                Files.createFile(Path.of(first, fileName));
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}
