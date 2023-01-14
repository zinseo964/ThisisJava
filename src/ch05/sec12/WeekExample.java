package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case 1 -> today = Week.SUNDAY;
            case 2 -> today = Week.MONDAY;
            case 3 -> today = Week.TUESDAY;
            case 4 -> today = Week.WEDNESDAY;
            case 5 -> today = Week.THURSDAY;
            case 6 -> today = Week.FRIDAY;
            case 7 -> today = Week.SATURDAY;
        }

        System.out.println("-- Today is "+today);

    }
}
