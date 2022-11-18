import java.sql.SQLOutput;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Jared");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int sum = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(sum);

        int myLastOne = 1000 - sum;
        System.out.println(myLastOne);
    }
}
