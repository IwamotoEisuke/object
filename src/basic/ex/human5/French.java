package basic.ex.human5;

import basic.human5.IfSayHello;

public class French implements IfSayHello {
    private String name;

    public French(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Je m'appelle " + name + ".");
    }
}
