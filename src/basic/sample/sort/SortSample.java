package basic.sample.sort;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class SortSample {
    public static void main(String[] args) {
        //5名のインスタンスをArrayListで作成
        List<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(
                new Student("あいざわ", Gender.MEN,60,50,70),
                new Student("いのうえ",Gender.WOMEN,80,80,100),
                new Student("うえの",Gender.MEN,40,50,60),
                new Student("えんどう",Gender.WOMEN,80,80,60),
                new Student("おおた",Gender.MEN,80,100,40)
        ));

        //配列の初期値を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/ArrayList.html#forEach(java.util.function.Consumer)
        System.out.println("初期の並び順");
        students.forEach(System.out::println);

        //比較関数の作成
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Comparator.html
        Comparator<Student> japNaturalOrder = Comparator.comparing(Student::getJap);
        Comparator<Student> japReverseOrder = Comparator.comparing(Student::getJap,Comparator.reverseOrder());
        Comparator<Student> mathReverseOrder = Comparator.comparing(Student::getMath,Comparator.reverseOrder());
        Comparator<Student> engReverseOrder = Comparator.comparing(Student::getEng,Comparator.reverseOrder());


        //出力
        students.sort(japNaturalOrder);
        System.out.println("\n国語の昇順");
        students.forEach(System.out::println);

        students.sort(japReverseOrder);
        System.out.println("\n国語の降順");
        students.forEach(System.out::println);

        students.sort(japReverseOrder.thenComparing(mathReverseOrder).thenComparing(engReverseOrder));
        System.out.println("\n国語の降順→数学の降順→英語の降順");
        students.forEach(System.out::println);

        students.sort(Comparator.naturalOrder());
        System.out.println("\n合計点の昇順");
        students.forEach(System.out::println);

        students.sort(Comparator.reverseOrder());
        System.out.println("\n合計点の降順");
        students.forEach(System.out::println);
    }
}