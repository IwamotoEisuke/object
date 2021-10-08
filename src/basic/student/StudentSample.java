package basic.student;

public class StudentSample {
    public static void main(String[] args) {
        //変数の宣言
        Student student1 = new Student("あいざわ","男",1);

        //インスタンスの利用
        //値の取得
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1);

        student1.setGrade(2);
        System.out.println(student1);

    }
}
