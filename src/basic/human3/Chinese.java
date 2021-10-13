package basic.human3;

public class Chinese extends Human {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字是" + name + "。");
    }
}
