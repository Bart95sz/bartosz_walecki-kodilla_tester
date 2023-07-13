public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int year = 2024; // Przykładowy rok do sprawdzenia
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " jest rokiem przestępnym: " + isLeap);
    }
}