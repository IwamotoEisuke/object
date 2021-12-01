package basic.ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class StreamPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("かきうち",Birthplace.OSAKA, Gender.WOMEN,22),
                new Person("おかもと",Birthplace.TOKYO,Gender.MEN,24),
                new Person("いそべ",Birthplace.FUKUOKA,Gender.MEN,25),
                new Person("いわもと",Birthplace.HOKKAIDO,Gender.MEN,23),
                new Person("たかはし",Birthplace.HOKKAIDO,Gender.WOMEN,46),
                new Person("ふくしま",Birthplace.TOKYO,Gender.WOMEN,22),
                new Person("いいだ",Birthplace.TOKYO,Gender.MEN,51),
                new Person("かわの",Birthplace.FUKUOKA,Gender.MEN,40),
                new Person("たきうえ",Birthplace.OSAKA,Gender.MEN,25),
                new Person("やまだ",Birthplace.OSAKA,Gender.WOMEN,22)
        ));
        //要素の一覧表示
        System.out.println("課題1");
        personList.forEach(System.out::println);
        //名前だけを表示
        System.out.println("課題2");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);
        //男性のみを表示
        System.out.println("課題3");
        personList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN))
                .forEach(System.out::println);
        //年齢の降順で表示
        System.out.println("課題4");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);
        //男性のみ名前の昇順で表示
        System.out.println("課題5");
        personList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
        //collectメソッドを使って名前リストを生成し表示
        System.out.println("課題6");
        List<String> nameList = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);
        //性別でグルーピングしたMAPを生成し表示
        System.out.println("課題7");
        Map<Gender,List<Person>> genderListMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        //System.out.println(genderListMap);
        genderListMap.entrySet().stream()
                .map(s -> s.getKey().getJpName() + ":" + s.getValue())
                .forEach(System.out::println);
        //男性で最年長の人を表示
        System.out.println("課題8");
        Optional<Person> oldestMen = personList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));
        oldestMen.ifPresent(System.out::println);
        //女性で最年少の人を表示
        System.out.println("課題9");
        /*
        Optional<Person> youngestWomen = personList.stream()
                .filter(s -> s.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
        youngestWomen.ifPresent(System.out::println);
         */
        OptionalInt youngestAge = personList.stream()
                .filter(s -> s.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .min();
        personList.stream()
                .filter(s -> s.getGender().equals(Gender.WOMEN))
                .filter(s -> s.getAge() == youngestAge.getAsInt())
                .forEach(System.out::println);


        //女性の平均年齢を求め表示
        System.out.println("課題10");
        OptionalDouble womenAve = personList.stream()
                .filter(s -> s.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .average();
        womenAve.ifPresent(a -> System.out.println("女性の平均年齢：" + Math.round(a*10.0)/10.0));
        //男性の平均年齢を求め表示
        System.out.println("課題11");
        OptionalDouble menAve = personList.stream()
                .filter(s -> s.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        menAve.ifPresent(a -> System.out.println("男性の平均年齢：" + Math.round(a*10.0)/10.0));
    }

}
