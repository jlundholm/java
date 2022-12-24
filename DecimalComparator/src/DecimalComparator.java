public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        value1 = (value1 * 1000);
        value2 = (value2 * 1000);
        int value3 = (int)value1;
        int value4 = (int)value2;
        //System.out.println("Value3: " + value3 + "; Value4: " + value4);
        if (value3 == value4) {
            return true;
        }

        return false;
    }
}
