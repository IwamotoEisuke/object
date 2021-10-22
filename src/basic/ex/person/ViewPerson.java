package basic.ex.person;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ViewPerson {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.addAll(Arrays.asList(
                new Person("しむら", Gender.MEN,28),
                new Person("すどう", Gender.WOMEN,34),
                new Person("そのだ", Gender.WOMEN,21),
                new Person("さの", Gender.MEN,42),
                new Person("せがわ", Gender.WOMEN,55)
        ));

        Comparator<Person> nameNaturalOrder = Comparator.comparing(Person::getName);
        Comparator<Person> ageNaturalOrder = Comparator.comparing(Person::getAge);
        Comparator<Person> ageReverseOrder = Comparator.comparing(Person::getAge,Comparator.reverseOrder());

        //出力
        System.out.println("\n課題1：一覧表示");
        people.forEach(System.out::println);

        people.sort(ageReverseOrder);
        System.out.println("\n課題2：年齢の降順");
        people.forEach(System.out::println);

        people.sort(nameNaturalOrder);
        System.out.println("\n課題3：男性の名前の昇順");
        for (Person person:people) {
            if (person.getGender().equals(Gender.MEN)) {
                System.out.println(person);
            }
        }
        System.out.println("\n課題4：男女別の平均年齢");
        int sumMen = 0;
        int sumWomen = 0;
        double countMen = 0;
        double countWomen = 0;
        for (Person person:people) {
            if (person.getGender().equals(Gender.MEN)){
                countMen++;
                sumMen += person.getAge();
            } else {
                countWomen++;
                sumWomen += person.getAge();
            }
        }
        System.out.println(String.format("男性の平均年齢: %.1f", sumMen/countMen));
        System.out.println(String.format("女性の平均年齢: %.1f", sumWomen/countWomen));

        List<Person> menList = new ArrayList<>();
        List<Person> womenList = new ArrayList<>();

        for (Person person:people) {
            if (person.getGender().equals(Gender.MEN)) {
                menList.add(person);
            } else {
                womenList.add(person);
            }
        }
        System.out.println("\n課題5：男女別の最年長");
        menList.sort(ageReverseOrder);
        womenList.sort(ageReverseOrder);
        /*
        for (Person person:menList) System.out.println(person);
        for (Person person:womenList) System.out.println(person);
        */
        System.out.println("男性の最年長：" + menList.get(0));
        System.out.println("女性の最年長：" + womenList.get(0));

    }
}
