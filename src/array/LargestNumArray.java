package array;

public class LargestNumArray {

        public static void main(String[] args) {
            int arr[]={1,8,57,85};
            int large= arr[0];
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] > large){
                    large=arr[i];
                }
            }

            System.out.println(large);
        }
    }

