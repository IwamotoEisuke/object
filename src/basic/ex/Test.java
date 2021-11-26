package basic.ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int f0, f1, fn;
        f0 = 0;
        f1 = 1;
        List<Integer> list = new ArrayList<>();
        list.add(f0);
        list.add(f1);
        while (list.size() < 30){
            fn = f0 + f1;
            if (fn > 1000)
                break;
            list.add(fn);
            f0 = f1;
            f1 = fn;
        }
        System.out.println(list);
        int[] array= new int[30];
        for (int i = 0; i < 30; i++) {
            if (i == 0)
                array[i] = 0;
            else if (i == 1)
                array[i] = 1;
            else
                array[i] = array[i-1] + array[i-2];
            if (array[i] < 1000)
                continue;
            else{
                System.out.println(Arrays.toString(array));
                System.out.println("配列の要素は"+ Array.getLength(array)+"個です");
                break;
            }

        }
    }
}
