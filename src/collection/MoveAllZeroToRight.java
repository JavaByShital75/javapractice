package collection;

import java.util.Arrays;

public class MoveAllZeroToRight {
    public static void main(String[] args) {
        int[] arr={1,5,0,8,6,0,5,0};
        int l =arr.length;
        int count=0;

        for(int i=0;i<l;i++){
            if(arr[i]!=0){
               arr[count ++]= arr[i];

            }
        }
        while (count<l){
           arr[count++]=0;

        }

        System.out.println(Arrays.toString(arr));
    }
}
