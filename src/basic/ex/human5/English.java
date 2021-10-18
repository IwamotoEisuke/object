package basic.ex.human5;

import basic.human5.IfSayHello;

public class English implements IfSayHello {
    private String name;
    public English(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello.I'm" + name + ".");
    }
}
