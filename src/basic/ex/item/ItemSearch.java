package basic.ex.item;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemSearch {
    public static void main(String[] args) {
        //課題1
        Map<Integer, Item> map= new HashMap<>();
        map.put(1, new Item(1,"消しゴム",100));
        map.put(2, new Item(2,"ボールペン",120));
        map.put(3, new Item(3,"コンパス",400));
        map.put(4, new Item(4,"定規",200));
        map.put(5, new Item(5,"ノート",140));
        map.put(6, new Item(6,"付箋",480));
        map.put(7, new Item(7,"えんぴつ",500));


        /*
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        */

        for (Item item:map.values()) {
            System.out.println(item);
        }

        /*
        for (Integer num:map.keySet()) {
            System.out.println(num);
        }
        */

        //課題2
        Scanner scanner = new Scanner(System.in);
        System.out.println("検索したい商品のIDを入力してください");
        int searchNo = scanner.nextInt();
        if (map.containsKey(searchNo)) {
            System.out.println("商品ID" + searchNo + "による検索結果\n" + map.get(searchNo));
        } else {
            System.out.println("商品ID" + searchNo + "による検索結果\n該当商品はありません");
        }


    }
}
