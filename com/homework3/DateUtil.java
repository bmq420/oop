package com.homework3;

//Exercise 1.9. DateUtil
public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] century = {6, 4, 2, 0};
    static int[] nonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    static int[] leapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (1 > year || year > 9999 || 1 > month || month > 12) {
            return false;
        }

        if (isLeapYear(year)) {
            daysInMonths[1] = 29;
        } else {
            daysInMonths[1] = 28;
        }

        for (int i = 0; i < daysInMonths.length; i++) {
            if (day < 1) {
                return false;
            }
            if (day > daysInMonths[month - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int getNumDayOfWeek(int year, int month, int day) {
        int sumModulus = 0;

        //Add first 2 digits
        sumModulus += century[(year / 100) % 4];

        //Add last 2 digits and last 2 digits divide by 4
        sumModulus += year % 100 + (year % 100)/ 4;

        //Add number from leap year or non-leap year
        if (isLeapYear(year)) {
            sumModulus += leapYear[month - 1];
        } else {
            sumModulus += nonLeapYear[month - 1];
        }

        //Add days
        sumModulus += day;

        int result = sumModulus % 7;
        return result;
    }

    public static String getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return null;
        }
        String result = "";
        int sum = getNumDayOfWeek(year, month, day);
        switch(sum) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tueday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
        }
        return result;
    }

    public static String printDate(int year, int month, int day) {
        if (!isValidDate(year, month, day))
            return null;
        return getDayOfWeek(year, month, day) + " "
                + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));
        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(printDate(2012, 2, 14));
    }
}
