package Lab04;

import java.utils.Arrays;
import java.util.Scanner;
import java.lang.String;

public class MyDate {
    private String day;
    private String month;
    private int year;

    public MyDate(String day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // contructor with no param
    public MyDate() {
    }

    // contructor with string param
    public MyDate(String date) {
        String[] arr = date.split(" ");
        this.day = arr[0];
        this.month = arr[1];
        this.year = Integer.parseInt(arr[2]);
    }

    // getter for day
    public String getDay() {
        return day;
    }

    // setter for day
    public void setDay(String day) {
        this.day = day;
    }

    // getter for month
    public String getMonth() {
        return month;
    }

    // setter for month

    public void setMonth(String month) {
        this.month = month;
    }

    // getter for year
    public int getYear() {
        return year;
    }

    // setter for year
    public void setYear(int year) {
        this.year = year;
    }

    public int checkValidDay(String day) {
        String[] days = { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th",
                "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th",
                "27th", "28th", "29th", "30th", "31st" };
        // day not in the list
        if (!(Arrays.asList(days).contains(day))) {
            return 0;
        }
        return 1;

    }

    public int checkValidMonth(String month) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        // month not in the list
        if (!(Arrays.asList(months).contains(month))) {
            return 0;
        }
        return 1;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        this.day = sc.nextLine();
        System.out.println("Enter month: ");
        this.month = sc.nextLine();
        System.out.println("Enter year: ");
        this.year = sc.nextInt();
    }

    public void print() {

        // print current date by system time
        if (this.day == null && this.month == null && this.year == 0) {
            System.out.println(java.time.LocalDate.now());
        } else {
            System.out.println(this.day + " " + this.month + " " + this.year);
        }
    }

    public void print(String format) {
        if (format.equals("dd/mm/yyyy")) {
            System.out.println(this.day + "/" + this.month + "/" + this.year);
        } else if (format.equals("mm/dd/yyyy")) {
            System.out.println(this.month + "/" + this.day + "/" + this.year);
        } else if (format.equals("yyyy/mm/dd")) {
            System.out.println(this.year + "/" + this.month + "/" + this.day);
        } else if (format.equals("yy-mm-dd")) {
            System.out.println(this.year + "-" + this.month + "-" + this.day);
        } else {
            System.out.println("Invalid format");
        }
    }

}
