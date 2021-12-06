package basic.ex.exception;

import java.io.IOException;

public class ThrowsException {
    static void readFile(String filePath) throws IOException{
        throw new IOException("ファイル" + filePath + "がありませんでした");
    }

    public static void main(String[] args) {
        try {
            readFile("c:\\text.txt");
        } catch (IOException e){
            System.out.println("ファイルの読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
