public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Jared");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) ||(secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        // Challenge -- My Solution
        double variable1 = 20.00;
        double variable2 = 80.00;
        double sum = (variable1 + variable2) * 100;
        System.out.println("My Value Total: " + sum);
        double remainder = sum % 40;
        System.out.println("Remainder: " + remainder);
        boolean step5;
        if (remainder == 0.00) {
            step5 = true;
        } else {
            step5 = false;
        }
        System.out.println("No remainder: " + step5);
        if (step5 == false) {
            System.out.println("got some remainder");
        }

        // Challenge -- Instructor Solution
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myValuesTotal = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("TheRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }

}
