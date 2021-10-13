package basic.human4;

//継承（スーパークラス）
abstract class Human {
    //フィールド
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}