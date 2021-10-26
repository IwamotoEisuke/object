package basic.sample.map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample2 {
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
        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap = 0,sumMath = 0,sumEng = 0;
            for (Student student:(List<Student>)entry.getValue()) {
                sumJap += student.getJap();
                sumMath += student.getMath();
                sumEng += student.getEng();
            }
            double aveJap = sumJap /((List<?>) entry.getValue()).size();
            double aveMath = sumMath /((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List<?>) entry.getValue()).size();

            System.out.println(String.format("%s %.2f %.2f %.2f",entry.getKey(),aveJap,aveMath,aveEng));
        }

    }
}

