package singleton;

public class SingleTonePro {
    private static SingleTonePro instance;
private SingleTonePro(){ // always do the consturctor private

}
public static SingleTonePro getData(){
       if(instance==null){
             instance =new SingleTonePro();

       }


    return instance;
}

}
