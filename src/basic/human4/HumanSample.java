package basic.human4;

public class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new French("Andrée")
        };

        for (Human human : humans) {
            human.sayHello();
        }
    }
}
