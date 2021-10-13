package basic.human5;


import basic.human2.Human;

public class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        IfSayHello[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Andrée")
        };

        for (IfSayHello human : humans) {
            human.sayHello();
        }
    }
}
