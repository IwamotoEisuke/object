package basic.ex.human5;

import basic.human5.IfSayHello;

public class Chinese implements IfSayHello {

    private  String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字是" + name + "。");
    }
}
