package array;

public class ThirdLargeNum {
    public static void main(String[] args) {
        int arr[]={52,85,485,548};
        int Flarge= Integer.MIN_VALUE;
        int Slarge= Integer.MIN_VALUE;
        int Tlarge= Integer.MIN_VALUE;

//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>Flarge){
//                Tlarge=Slarge;
//                Slarge=Flarge;
//                Flarge=arr[i];
//            } else if (arr[i]>Slarge && arr[i]!=Flarge) {
//                Tlarge=Flarge;
//                Slarge=arr[i];
//            } else if (arr[i]>Tlarge && arr[i]!=Flarge && arr[i]!=Slarge ) {
//                Tlarge=arr[i];
//
//            }
//        }
        for(int i:arr){
            if(i>Flarge){
                Tlarge=Slarge;
                Slarge=Flarge;
                Flarge=i;
            }
            else if (i>Slarge && i !=Flarge ) {
                Tlarge=Slarge;
                Slarge=i;

            }
            else if (i>Tlarge && i !=Flarge && i !=Slarge) {
                Tlarge = i;
            }
        }
        System.out.println("1st large is " + Flarge );
        System.out.println("2nd large is " + Slarge );
        System.out.println("3rd large is " + Tlarge );
    }
}
