package basic.ex.sutudent2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentSample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(
        new Student("あいざわ", Gender.MEN, 60, 50, 70),
        new Student("いのうえ",Gender.WOMEN,90,80,100),
        new Student("うえの",Gender.MEN,40,50,60),
        new Student("えんどう",Gender.WOMEN,80,20,60),
        new Student("おおた",Gender.MEN,70,100,40)
        ));

        for (Student student : students){
            System.out.println(student);
        }


    }
}
