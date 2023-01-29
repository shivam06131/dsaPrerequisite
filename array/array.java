package array;

import java.util.Arrays;

public class array {
    public void myMethod() {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // toString
        System.out.println("numbers here " + Arrays.toString(numbers));

        // print numbers array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }
    }
}