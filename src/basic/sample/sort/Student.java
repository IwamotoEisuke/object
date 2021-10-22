package basic.sample.sort;

import basic.sample.enumsample.Gender;

//学生クラス
class Student implements Comparable<Student> {
    //フィールド
    private String name;//名前
    private Gender gender;//性別
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    //コンストラクタ

    public Student(String name, Gender gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
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

    /**
     * テストの個人合計を求める
     * @return int 国語・数学・英語の合計点
     */
    public Integer sum() {
        return jap + math + eng;
    }

    /**
     * テストの個人平均を求める
     * @return double 国語・数学・英語の平均点
     */
    public double ave() {
        return sum() / 3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f"
                ,name,gender.getJpName(),jap,math,eng,sum(),ave());
    }


    @Override
    public int compareTo(Student o) {
        return sum().compareTo(o.sum());
    }
}
