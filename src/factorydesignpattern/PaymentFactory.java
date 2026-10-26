package factorydesignpattern;

public class PaymentFactory {
    public static Payment create(String type){
        if(type.equals("upi")){
            return new UpiPay();
        } else if (type.equals("card")) {
            return new CardPay();
        }
        return null;


    }
}
