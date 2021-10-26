package basic.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正規表現のサンプル
public class RegexSample {
    public static void main(String[] args) {
        //郵便番号の正規表現
        String regex = "^[0-9]{3}-[0-9]{4}$";
        String zip1 = "064-0809";
        System.out.println(zip1.matches(regex));
        String zip2 = "0000-888";
        System.out.println(zip2.matches(regex));

        //正規表現の準備
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;

        List<String> zipList = List.of(zip1,zip2);
        for (String zip:zipList) {
            matcher = pattern.matcher(zip);
            if (matcher.matches()) {
                System.out.println(zip + ":ok");
            } else {
                System.out.println(zip + ":ng");
            }
        }
    }
}
