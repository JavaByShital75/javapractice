package factorydesignpattern;

public class CardPay implements Payment{
    @Override
    public void pay(int pay) {
        System.out.println("card payment is done with RS:"+pay);
    }
}
