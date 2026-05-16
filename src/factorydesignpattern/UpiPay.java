package factorydesignpattern;

public class UpiPay implements Payment{
    @Override
    public void pay(int pay) {
        System.out.println("upi payment is done with RS:"+pay);

    }
}
