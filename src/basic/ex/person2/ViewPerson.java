package basic.ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("かきうち",Birthplace.OSAKA, Gender.WOMEN,22),
                new Person("おかもと",Birthplace.TOKYO,Gender.MEN,24),
                new Person("いそべ",Birthplace.FUKUOKA,Gender.MEN,25),
                new Person("いわもと",Birthplace.HOKKAIDO,Gender.MEN,23),
                new Person("たかはし",Birthplace.HOKKAIDO,Gender.WOMEN,46),
                new Person("ふくしま",Birthplace.TOKYO,Gender.WOMEN,17),
                new Person("いいだ",Birthplace.TOKYO,Gender.MEN,51),
                new Person("かわの",Birthplace.FUKUOKA,Gender.MEN,40),
                new Person("たきうえ",Birthplace.OSAKA,Gender.MEN,25),
                new Person("やまだ",Birthplace.OSAKA,Gender.WOMEN,22)
        ));

        Map<Birthplace,List<Person>> personGroupMap = new HashMap<>(40);
        for (Person person:personList) {
            if (personGroupMap.containsKey(person.getBirthplace())) {
                personGroupMap.get(person.getBirthplace()).add(person);
            } else {
                List<Person> list = new ArrayList<>();
                list.add(person);
                personGroupMap.put(person.getBirthplace(),list);
            }
        }

        for (Map.Entry entry: personGroupMap.entrySet()) {
            double sumAge = 0;
            for (Person person:(List<Person>)entry.getValue()) {
                sumAge += person.getAge();
                System.out.println(person);
            }
            double aveAge = sumAge/ ((List<Person>) entry.getValue()).size();
            System.out.println(String.format("%s の平均年齢： %.2f\n",((Birthplace)entry.getKey()).getPlaceName(),aveAge));

        }
    }
}
