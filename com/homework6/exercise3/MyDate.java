package com.homework6.exercise3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private final String[] MONTHS = {"Jan", "Feb", "Mar",
            "Apr", "May", "Jun",
            "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec"};
    private final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (1 > year || 1 > month || month > 12) {
            return false;
        }

        if (isLeapYear(year)) {
            DAYS_IN_MONTHS[1] = 29;
        } else {
            DAYS_IN_MONTHS[1] = 28;
        }

        for (int i = 0; i < DAYS_IN_MONTHS.length; i++) {
            if (day < 1) {
                return false;
            }
            if (day > DAYS_IN_MONTHS[month - 1]) {
                return false;
            }
        }
        return true;
    }

    public int getNumDayOfWeek(int year, int month, int day) {
        int sumModulus = 0;
        int[] century = {6, 4, 2, 0};
        int[] nonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        //Add first 2 digits
        sumModulus += century[(year / 100) % 4];

        //Add last 2 digits and last 2 digits divide by 4
        sumModulus += year % 100 + (year % 100) / 4;

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

    public String getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return null;
        }
        String result = "";
        int sum = getNumDayOfWeek(year, month, day);
        switch (sum) {
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

    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            System.out.println("Invalid year, month, or day!");
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            System.out.println("Invalid year, month, or day!");
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(getDayOfWeek(year, month, day)).append(" ").append(day).append(" ").append(MONTHS[month - 1]).append(" ").append(year);
        return build.toString();
    }

    public MyDate nextDay() {
        if (day == DAYS_IN_MONTHS[month - 1]) {
            day = 1;
            nextMonth();
        } else {
            day += 1;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            nextYear();
        } else if (DAYS_IN_MONTHS[month - 1] > DAYS_IN_MONTHS[month] && day == DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month];
            month += 1;
        } else {
            month += 1;
        }
        return this;
    }

    public MyDate nextYear() {
        if (isLeapYear(year) && day == 29 && month == 2) {
            day = 28;
        }
        year += 1;
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            day = DAYS_IN_MONTHS[month - 1];
            previousMonth();
        } else {
            day -= 1;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            previousYear();
        } else if (DAYS_IN_MONTHS[month - 1] > DAYS_IN_MONTHS[month - 2] && day == DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month - 2];
            month -= 1;
        } else {
            month -= 1;
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(year) && day == 29 && month == 2) {
            day = 28;
        }
        year -= 1;
        return this;
    }
}
