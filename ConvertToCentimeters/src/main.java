public class main {
    public static void main(String[] args) {

        System.out.println("Your height is " + convertToCentimeters(5,9) + " inches.");
    }

    public static double convertToCentimeters(int heightInches) {
        double result = heightInches * 2.54;

        return result;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int result = (feet * 12) + inches;
        //System.out.println("Your height is " + heightInches + " inches.");
        System.out.println("You height is " + convertToCentimeters(69) + " centimeters.");

        return result;
    }
}
