public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        //System.out.println(printConversion(1.5));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double distance = 0;
        if (kilometersPerHour < 0) {
            distance = -1;
        } else {
            distance = (kilometersPerHour / 1.609);
        }
        return (long)Math.round(distance);
    }

    public static void printConversion(double kilometersPerHour) {
        long distance = 1;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            distance = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + distance + " mi/h");
        }
    }
}
