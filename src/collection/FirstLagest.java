package collection;

public class FirstLagest {

    public static void main(String[] args) {
        int temp, size;
        int arr[]={10,58,65,45,85};
        int largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                largest = num;
            }
        }
        System.out.println("first largest number is : "+largest);
    }
}
