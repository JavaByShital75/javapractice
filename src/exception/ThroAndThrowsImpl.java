package exception;

public class ThroAndThrowsImpl {
    public void getMoney(int amount) throws ThroAndThrows {
        if (amount>5000){
           throw new ThroAndThrows("you do not have a sufficiant balance");
        }
      else {
          System.out.println("your transaction succesfully");
        }
    }

    public static void main(String[] args) throws ThroAndThrows {
        ThroAndThrowsImpl t=new ThroAndThrowsImpl();
        t.getMoney(6000);
        //t.getMoney(4000);
}

}
