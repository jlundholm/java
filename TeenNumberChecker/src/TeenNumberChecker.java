public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {

        if ((ageOne > 12 && ageOne < 20) || (ageTwo > 12 && ageTwo < 20) || (ageThree > 12 && ageThree < 20)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int ageTeen) {

        if (ageTeen <= 19 && ageTeen >= 13) {
            return true;
        }
        return false;
    }

}
