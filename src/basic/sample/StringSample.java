package basic.sample;

import java.util.Arrays;

public class StringSample {
    public static void main(String[] args) {
        String word1 = "aaa";
        System.out.println(word1.concat("bbb"));

        String sentence = "1-1,いのうえ,女,80,70,95";
        String[] data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        String original= "This is a pen.";
        String replace = original.replace("is","at");
        System.out.println(replace);
    }
}
