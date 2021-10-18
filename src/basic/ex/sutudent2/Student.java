package basic.ex.sutudent2;

import basic.sample.enumsample.Gender;

class Student {
    private String name;
    private Gender gender;
    private int jap;
    private int math;
    private int eng;

    public Student(String name, Gender gender, int jap, int math, int eng) {
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

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f",name,gender.getJpName(),jap,math,eng,sum(),ave());
    }
}
