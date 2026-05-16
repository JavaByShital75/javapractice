package collection;

import java.util.Arrays;

public class IntArrayReverse {
    public static void main(String[] args) {
        int[] arr = {6, 50, 58, 65, 5};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }

}


