package exception;

public class AccountTransactionThrowAndThrowsImpl {
    public void getMoney( int amount) throws ThrowAndThrows {
        if (amount > 5000) {
            throw new ThrowAndThrows("you do not have a sufficiant balance to make this transaction succesfully");
        }
        else {
System.out.println("your transaction succesfully,please collect your amount");
        }
    }

    public static void main(String[] args) throws ThrowAndThrows {
        AccountTransactionThrowAndThrowsImpl a=new AccountTransactionThrowAndThrowsImpl();
            a.getMoney(6000);
        
    }
}
