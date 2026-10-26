package collection;

import java.util.Arrays;

public class StringArrayReverse {
    public static void main(String[] args) {
        String[] arr= {"Tyson", "Shital", "Sunita"};

        int start =0;
        int end = arr.length-1;

        while(start<end){
            String temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
            System.out.println(Arrays.toString(arr));

        }
    }

}
