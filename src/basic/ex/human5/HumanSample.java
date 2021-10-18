package basic.ex.human5;


import basic.human5.IfSayHello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
         List<IfSayHello> humans = new ArrayList<>();
         humans.addAll(Arrays.asList(
                 new English("Tom"),
                 new Japanese("ひろし"),
                 new Chinese("王"),
                 new French("Andrée")
         ));

        for (IfSayHello human : humans) {
            human.sayHello();
        }
    }
}
