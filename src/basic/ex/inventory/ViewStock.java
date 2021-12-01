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
            if (!storagePriceMap.containsKey(storageNo)) {
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
    }
}
