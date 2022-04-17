package Lab02;

import java.util.Scanner;

public class NumberDayOfMonth {
    public int checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public int checkValidYear(int year) {
        if (year < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getMonthByString(String month) {
        String[] Jan = { "January", "Jan", "1", "Jan." };
        String[] Feb = { "February", "Feb", "2", "Feb." };
        String[] Mar = { "March", "Mar", "3", "Mar." };
        String[] Apr = { "April", "Apr", "4", "Apr." };
        String[] May = { "May", "May", "5", "May." };
        String[] Jun = { "June", "Jun", "6", "Jun." };
        String[] Jul = { "July", "Jul", "7", "Jul." };
        String[] Aug = { "August", "Aug", "8", "Aug." };
        String[] Sep = { "September", "Sep", "9", "Sep." };
        String[] Oct = { "October", "Oct", "10", "Oct." };
        String[] Nov = { "November", "Nov", "11", "Nov." };
        String[] Dec = { "December", "Dec", "12", "Dec." };
        String[][] monthList = { Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec };
        for (int i = 0; i < monthList.length; i++) {
            for (int j = 0; j < monthList[i].length; j++) {
                if (monthList[i][j].equals(month)) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    public int getNumberDayOfMonth(int year, int month) {
        int[] numberDayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (checkLeapYear(year) == 1) {
            numberDayOfMonth[1] = 29;
        }
        return numberDayOfMonth[month - 1];
    }

    public static void main(String[] args) {
        // display the number of days of a month
        Scanner keyboard = new Scanner(System.in);
        int year = 0;
        int month = 0;
        String strMonth = "";
        NumberDayOfMonth n = new NumberDayOfMonth();
        while (true) {
            System.out.println("Enter a year: ");
            year = keyboard.nextInt();
            if (n.checkValidYear(year) == 1) {
                break;
            } else {
                System.out.println("Invalid year. Please enter again.");
            }
        }

        while (true) {
            System.out.println("Enter a month: ");
            strMonth = keyboard.nextLine();
            if (n.getMonthByString(strMonth) != 0) {
                month = Integer.parseInt(strMonth);
                break;
            } else {
                System.out.println("Invalid month. Please enter again.");
            }
        }
        int numberDayOfMonth = n.getNumberDayOfMonth(year, month);
        System.out.println("Year: " + year + " Month: " + month + ". Number of days: " + numberDayOfMonth);

    }
}