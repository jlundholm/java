public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3701));
    }

    public static String getDurationString(int seconds) {
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;
        hours = (seconds / 60) / 60;
        minutes = seconds % 60;
        remainingSeconds = seconds % 60;

        return hours + "h " + minutes + "m " + remainingSeconds + "s' ";
    }

    public static String getDurationString(int minutes, int seconds) {

        return "";
    }
}
