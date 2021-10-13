package basic.ex.student;

class Student {
    private String name;
    private String gender;
    private int jap;
    private int math;
    private int eng;

    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }


    public int sum() {
        return jap + math + eng;
    }

    public double ave() {
        return sum() / 3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f",name,gender,jap,math,eng,sum(),ave());
    }
}
