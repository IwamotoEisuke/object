package basic.figure3;

//図形の面積
class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        IfGetArea[] figures = {
                new Rectangle(10,20),
                new Triangle(20,15),
                new Circle(10)
        };
        //出力
        for (IfGetArea figure:figures) {
            System.out.println(figure.getArea());
        }

    }
}