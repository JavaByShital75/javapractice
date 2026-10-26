package array;

public class FirstLargeNum {
    public static void main(String args[]) {
        int[] arr = {1, 9, 5, 8, 10, 2};
        int large = arr[0];
//        for (int i = 1; i<arr.length; i++) {
//            if (arr[i] > large) {
//                large = arr[i];
//            }
//        }
        for(int i:arr){
            if(i>large){
                large=i;

            }

        }
        System.out.println(large);
    }
}
