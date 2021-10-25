package basic.sample.map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのマップ
        Map<String, List<Student>> studentGroupMap = new HashMap<>(40);
        //学生のリスト
        List<Student> studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1", "ふじもと", Gender.MEN, 50, 60, 40));
        studentList.add(new Student("1-1", "かきうち", Gender.WOMEN, 80, 20, 70));
        studentList.add(new Student("1-1", "やまだ", Gender.WOMEN, 60, 50, 80));
        studentList.add(new Student("1-2", "いそべ", Gender.MEN, 70, 90, 80));
        studentList.add(new Student("1-2", "おおうち", Gender.WOMEN, 80, 10, 70));
        studentList.add(new Student("1-2", "つじわき", Gender.MEN, 50, 80, 20));
        studentList.add(new Student("1-3", "つるた", Gender.MEN, 30, 100, 50));
        studentList.add(new Student("1-3", "おかもと", Gender.MEN, 100, 60, 90));
        studentList.add(new Student("1-3", "やまなか", Gender.MEN, 60, 40, 50));
        studentList.add(new Student("1-4", "たにむら", Gender.MEN, 70, 70, 90));
        studentList.add(new Student("1-4", "おおむら", Gender.WOMEN, 50, 40, 70));
        studentList.add(new Student("1-4", "もりた", Gender.WOMEN, 70, 60, 100));
        studentList.add(new Student("1-5", "きむら", Gender.MEN, 80, 70, 80));
        studentList.add(new Student("1-5", "なみね", Gender.MEN, 100, 90, 100));
        studentList.add(new Student("1-5", "えびな", Gender.WOMEN, 40, 40, 70));

        for (Student student : studentList) {
            //マップに存在するクラスの生徒が出現
            if (studentGroupMap.containsKey(student.getGroup())) {
                //リストに追加
                studentGroupMap.get(student.getGroup()).add(student);
            } else {
                //新しいキーを作成
                //空のリストをセット
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(), list);
            }
        }
        int countStudent1 = 0;
        int countStudent2 = 0;
        int countStudent3 = 0;
        int countStudent4 = 0;
        int countStudent5 = 0;
        int sumJap1 = 0, sumMath1 = 0, sumEng1 = 0;
        int sumJap2 = 0, sumMath2 = 0, sumEng2 = 0;
        int sumJap3 = 0, sumMath3 = 0, sumEng3 = 0;
        int sumJap4 = 0, sumMath4 = 0, sumEng4 = 0;
        int sumJap5 = 0, sumMath5 = 0, sumEng5 = 0;

            for (Student student : studentList) {

                if (student.getGroup().equals("1-1")) {
                    countStudent1++;
                    sumJap1 += student.getJap();
                    sumMath1 += student.getMath();
                    sumEng1 += student.getEng();
                } else if (student.getGroup().equals("1-2")) {
                    countStudent2++;
                    sumJap2 += student.getJap();
                    sumMath2 += student.getMath();
                    sumEng2 += student.getEng();
                } else if (student.getGroup().equals("1-3")) {
                    countStudent3++;
                    sumJap3 += student.getJap();
                    sumMath3 += student.getMath();
                    sumEng3 += student.getEng();
                } else if (student.getGroup().equals("1-4")) {
                    countStudent4++;
                    sumJap4 += student.getJap();
                    sumMath4 += student.getMath();
                    sumEng4 += student.getEng();
                } else if (student.getGroup().equals("1-5")) {
                    countStudent5++;
                    sumJap5 += student.getJap();
                    sumMath5 += student.getMath();
                    sumEng5 += student.getEng();
                }
            }
            System.out.println("1-1\n国語の平均点" + sumJap1 / countStudent1 + "\n数学の平均点" + sumMath1 / countStudent1 + "\n英語の平均点" + sumEng1 / countStudent1);
            System.out.println("1-2\n国語の平均点" + sumJap2 / countStudent2 + "\n数学の平均点" + sumMath2 / countStudent2 + "\n英語の平均点" + sumEng2 / countStudent2);
            System.out.println("1-3\n国語の平均点" + sumJap3 / countStudent3 + "\n数学の平均点" + sumMath3 / countStudent3 + "\n英語の平均点" + sumEng3 / countStudent3);
            System.out.println("1-4\n国語の平均点" + sumJap4 / countStudent4 + "\n数学の平均点" + sumMath4 / countStudent4 + "\n英語の平均点" + sumEng4 / countStudent4);
            System.out.println("1-5\n国語の平均点" + sumJap5 / countStudent5 + "\n数学の平均点" + sumMath5 / countStudent5 + "\n英語の平均点" + sumEng5 / countStudent5);

        }
}
