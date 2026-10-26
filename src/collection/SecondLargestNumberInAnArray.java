package collection;

public class SecondLargestNumberInAnArray {
    public static void main(String[] args) {
        int temp, size;
        int arr[]={10,58,65,45,85};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            } else if (num>secondLargest && num!=secondLargest) {
                secondLargest = num;

            }
        }
        System.out.println("first largest number is : "+largest);
        System.out.println("second largest number is : "+secondLargest);
    }
}
