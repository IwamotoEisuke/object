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
            double sumAge = 0,menSumAge = 0,womenSumAge = 0,menCnt = 0,womenCnt = 0;
            for (Person person:(List<Person>)entry.getValue()) {
                sumAge += person.getAge();
                if (person.getGender().equals(Gender.MEN)) {
                    menCnt++;
                    menSumAge += person.getAge();
                } else {
                    womenCnt++;
                    womenSumAge += person.getAge();
                }
            }
            double aveAge = sumAge/ ((List<Person>) entry.getValue()).size();
            double menAveAge = menSumAge/menCnt;
            double womenAveAge = womenSumAge/womenCnt;
            System.out.println(String.format("\n%s の平均年齢： %.2f",((Birthplace)entry.getKey()).getPlaceName(),aveAge));
            System.out.println(String.format("%s の男の平均年齢： %.2f",((Birthplace) entry.getKey()).getPlaceName(),menAveAge));
            System.out.println(String.format("%s の女の平均年齢： %.2f",((Birthplace) entry.getKey()).getPlaceName(),womenAveAge));

        }
    }
}
