package factorydesignpattern;

public class PaymentImpl {
    public static void main(String[] args) {
        Payment p=PaymentFactory.create("card");
        p.pay(5000);
        Payment p1=PaymentFactory.create("upi");
        p1.pay(520000);
    }

}
