public class isLeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year > 0) {
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    return false;
                } else {
                    return true;
                }

            } else {
                return true;
            }
        }
        return false;


    }
}
