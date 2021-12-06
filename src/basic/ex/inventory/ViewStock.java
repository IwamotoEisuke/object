package basic.ex.inventory;

import java.util.*;

public class ViewStock {
    public static void main(String[] args) {
        // pcListを初期化する
        List<PersonalComputer> pcList = new ArrayList<>();
        // PC情報をリストに追加
        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 40000, Constants.BIT_64, Constants.WINDOWS_10),
                new PersonalComputer("いけだ", 2, 1, 90000, Constants.BIT_64, Constants.WINDOWS_11),
                new PersonalComputer("いのうえ", 3, 1, 80000, Constants.BIT_64, Constants.WINDOWS_11),
                new PersonalComputer("たむら", 4, 2, 120000, Constants.BIT_32, Constants.MAC),
                new PersonalComputer("わだ", 5, 2, 30000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("くどう", 6, 2, 150000, Constants.BIT_64, Constants.MAC),
                new PersonalComputer("さらど", 7, 3, 40000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("あいざわ", 8, 3, 70000, Constants.BIT_32, Constants.MAC)
        ));

        // 保管倉庫ごとの在庫金額を抽出したいのでマップにする
        // storagePriceMapの初期化をする
        Map<Integer, ArrayList<Integer>> storagePriceMap = new HashMap<>();

        // Key：StorageNo
        // Value：Price
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo();
            if (!storagePriceMap.containsKey(storageNo)) { //Mapの中に倉庫番号がkeyとして入っているか
                storagePriceMap.put(storageNo, new ArrayList<>());
            }
            storagePriceMap.get(storageNo).add(p.getPrice());
        }

        // storagePriceMapの中身を表示
        System.out.println("// storagePriceMapの中身チェック");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("PC金額:" + entry.getValue());
        }

        // 保管倉庫ごとの在庫内容を抽出したいのでマップにする
        // osMapの初期化をする
        Map<Integer, ArrayList<String>> osMap = new HashMap<>();

        // Key：StorageNo
        // Value：OS
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo();
            if (!osMap.containsKey(storageNo)) {
                osMap.put(storageNo, new ArrayList<>());
            }
            osMap.get(storageNo).add(p.getOS());
        }

        // osMapの中身を表示
        System.out.println("// osMapの中身チェック");
        for (Map.Entry entry : osMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("OS:" + entry.getValue());
        }
        //倉庫ごとのPC合計金額を計算し表示
        System.out.println("//倉庫ごとの合計金額");
        for (Map.Entry entry: storagePriceMap.entrySet()){
            double sum = 0; //合計を入れる変数を定義
            for (Integer i: (List<Integer>)entry.getValue()){
                sum += i;
            }
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("合計金額" + sum + "円");
        }
        //合計台数を表示
        System.out.println("//倉庫ごとの合計台数");
        for (Map.Entry entry: storagePriceMap.entrySet()){
            int cnt = ((List)entry.getValue()).size();
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("合計台数" + cnt + "台");
        }

        //倉庫別に１台ごとの平均金額を表示
        System.out.println("//倉庫ごとのPC平均金額");
        for (Map.Entry entry: storagePriceMap.entrySet()){
            double sum = 0;
            int cnt = 0;
            for (Integer i :((List<Integer>)entry.getValue())){
                sum += i;
                cnt++;
            }
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("平均金額" + Math.round(sum/cnt * 10.0) / 10.0 + "円");
        }

        //倉庫別に1台ごとの平均金額を表示
    }
}
