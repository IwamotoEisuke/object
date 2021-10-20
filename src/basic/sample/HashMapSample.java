package basic.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        //宣言
        Map<String, String> map = new HashMap<>();
        //要素の追加
        map.put("apple","りんご");
        map.put("pineapple","パイナップル");
        map.put("orenge","オレンジ");
        //表示
        System.out.println(map);
        //要素の取得
        System.out.println(map.get("apple"));
        //キーの集合を取得
        System.out.println(map.keySet());
        //値の集合を取得
        System.out.println(map.values());
        //キーと値の取得
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //要素の削除
        System.out.println(map.remove("orenge"));
        //要素の変更
        System.out.println(map.put("apple","リンゴ"));
        //表示
        System.out.println(map);
        //キーによる検索
        String searchWord = "apple";
        if (map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        } else {
            System.out.println("Not found:" + searchWord);
        }

    }
}
