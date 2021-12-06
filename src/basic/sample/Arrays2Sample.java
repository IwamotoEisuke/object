package basic.sample;

public class Arrays2Sample {
    public static void main(String[] args) {
        int arrayLength = 16;
        int[] array = new int[arrayLength];
        String[] arrayString = new String[arrayLength];

        for (int i = 0 ;i < arrayLength; i++) {
            array[i] = i + 1;
            if (array[i] % 3 == 0 && array[i] % 5 == 0){
                arrayString[i] = "FizzBuzz";
            } else if (array[i] % 3 == 0) {
                arrayString[i] = "Fizz";
            } else if (array[i] % 5 == 0) {
                arrayString[i] = "Buzz";
            } else{
                arrayString[i] = String.valueOf(array[i]);
            }
            System.out.println(arrayString[i]);
        }
    }
}
