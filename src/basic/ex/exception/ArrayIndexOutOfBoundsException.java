package basic.ex.exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = {1, 30, 72};
        try {
            for (int i = 0; i < 4; i++ ){
                System.out.println(array[i]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("配列の範囲を超えています");
        } finally {
            System.out.println("終了");
        }

    }
}
