public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloByte) {
        //"2500 KB = 2 MB and 452 KB"
        int megaByte;
        int kiloMinusMega;
        if (kiloByte < 0) {
            System.out.println("Invalid Value");
        } else {
            megaByte = kiloByte / 1024;
            kiloMinusMega = kiloByte - (megaByte * 1024);
            System.out.println(kiloByte + " KB = " + megaByte + " MB and " + kiloMinusMega + " KB");
        }
    }
}
