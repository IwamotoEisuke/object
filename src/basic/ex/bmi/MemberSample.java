package basic.ex.bmi;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberSample {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.addAll(Arrays.asList(
                new Member("藤本遼太郎", Gender.MEN,24,1.68,49.0),
                new Member("風早宏基",Gender.MEN,24,1.74,76.0),
                new Member("柴垣修一郎",Gender.MEN,27,1.66,40.0),
                new Member("西摩子",Gender.WOMEN,24,1.58,56.0),
                new Member("山田結花",Gender.WOMEN,23,1.65,48.0)
        ));
        for (Member member:memberList) {
            System.out.println(member);
        }
    }
}
