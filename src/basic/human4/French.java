package basic.human4;

public class French extends Human {
    public French(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Je m'appelle " + name + ".");
    }
}
