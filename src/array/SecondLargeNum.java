package array;

public class SecondLargeNum {
    public static void main(String[] args) {
        int arr[]={1,8,42,85};
        int Flarge=Integer.MIN_VALUE;
        int Slarge=Integer.MIN_VALUE;

//        for(int i=0;i<arr.length;i++){
//         if(arr[i]>Flarge){
//             Slarge=Flarge;
//             Flarge=arr[i];
//         }
//         else if (arr[i]>Slarge && arr[i]!=Flarge) {
//             Slarge=arr[i];
//         }
//        }
        for(int i:arr){
            if(i>Flarge){
             Slarge=Flarge;
             Flarge=i;
            } else if (i>Slarge && i !=Flarge) {
                Slarge=i;

            }

        }
        System.out.println("1st large is " + Flarge);
        System.out.println("2nd large is " + Slarge);

    }
}
