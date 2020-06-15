package com.LITRuleEngine.LITPOC.models;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateKeeper {
    private Date d1;
    private Date d2;
    Long daysDiff;
    Integer monthsDiff;

    public DateKeeper(Date d1, Date d2) {
        this.d1 = d1;
        this.d2 = d2;
        this.daysDiff = DateKeeper.getDifferenceDays(d2, d1);
        this.monthsDiff = DateKeeper.getDifferenceMonth(d2, d1);
    }

    public static Long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public static Integer getDifferenceMonth(Date d1, Date d2) {
        Calendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(d1);
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(d2);

        int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);

        return diffMonth;
    }

    public static Long getDifferenceMonths(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public Long getDaysDiff() {
        return daysDiff;
    }

    public void setDaysDiff(Long daysDiff) {
        this.daysDiff = daysDiff;
    }

    public Integer getMonthsDiff() {
        return monthsDiff;
    }
}
