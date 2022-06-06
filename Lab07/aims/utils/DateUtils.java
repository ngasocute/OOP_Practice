package hust.soict.globalict.aims.utils;
import hust.soict.globalict.test.utils.MyDate;

public class DateUtils {
    public static int compareDate(MyDate date0, MyDate date1) {
        if(date0.getYear() > date1.getYear())
            return 1;
        else if(date0.getYear() < date1.getYear())
            return -1;
        else if(date0.getMonth() > date1.getMonth())
            return 1;
        else if(date0.getMonth() < date1.getMonth())
            return -1;
        else if(date0.getDay() > date1.getDay())
            return 1;
        else if(date0.getDay() < date1.getDay())
            return -1;
        else
            return 0;
    }
    public static MyDate[] sortDates(MyDate...dates) {
        for(int i = 0; i < dates.length; i++) {
            for(int j = i + 1; j < dates.length; j++) {
                if(compareDate(dates[i], dates[j]) > 0) {
                    MyDate temp = dates[j];
                    dates[j] = dates[i];
                    dates[i] = temp;
                }
            }
        }
        return dates;
    }
}
