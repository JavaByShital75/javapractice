package exception;

public class CustomPayment {
    public String getAge(int age) throws CustomException {

        if (age>18 && age<30) {
            System.out.println("you are eligible for 500 amount");
        } else if (age>30 && age<60) {
            System.out.println("you are eligible for 1000 amount");
        } else{
             throw new CustomException("you are not eligible for any pansion:");
        }
           return null;
    }
}
