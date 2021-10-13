package basic.ex.student;

public class StudentSample {
    public static void main(String[] args) {

        Student student1 = new Student("あいざわ", "男", 60, 50, 70);
        Student student2 = new Student("いのうえ","女",90,80,100);
        Student student3 = new Student("うえの","男",40,50,60);
        Student student4 = new Student("えんどう","女",80,20,60);
        Student student5 = new Student("おおた","男",70,100,40);

        Student[] students = {
                student1,student2,student3,student4,student5
        };

        for (Student student : students){
            System.out.println(student);
        }


    }
}
