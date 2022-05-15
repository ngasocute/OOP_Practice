package Lab05;

public class DateUtils {
    // compare two dates
    public static boolean isEarlier(MyDate date1, MyDate date2) {
        if (date1.getYear() < date2.getYear()) {
            return true;
        } else if (date1.getYear() == date2.getYear()) {
            if (date1.getMonth().compareTo(date2.getMonth()) < 0) {
                return true;
            } else if (date1.getMonth().compareTo(date2.getMonth()) == 0) {
                if (date1.getDay().compareTo(date2.getDay()) < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // sorting a number of date
    public static MyDate[] sort(MyDate[] dates) {
        for (int i = 0; i < dates.length - 1; i++) {
            for (int j = i + 1; j < dates.length; j++) {
                if (isEarlier(dates[i], dates[j])) {
                    MyDate temp = dates[i];
                    dates[i] = dates[j];
                    dates[j] = temp;
                }
            }
        }
        return dates;
    }

}
