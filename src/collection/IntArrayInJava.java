package collection;

import java.util.Arrays;

public class IntArrayInJava {
    int a;
    int b;
    int c;
    int d;

    public static void main(String[] args) {
        int[] arr= {5,10,52,85,65};

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        for( int i:arr){
            System.out.println(i);

        }
for(int i=0;i< arr.length;i++){
    System.out.println(arr[i]);

}

        int[] copyOf = Arrays.copyOf(arr, arr.length);
 System.out.println(Arrays.toString(copyOf));
        Arrays.sort(copyOf);
        System.out.println(Arrays.toString(copyOf));
        System.out.println(copyOf[4]);

        // Reverse Program
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers towards the middle
            start++;
            end--;
        }
    System.out.println(Arrays.toString(arr));
    }

}


