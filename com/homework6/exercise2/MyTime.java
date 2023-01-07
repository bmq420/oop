package com.homework6.exercise2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        if ((0 > hour || hour > 23) || (0 > minute || minute > 59) || (0 > second || second > 59)) {
            System.out.println("Invalid hour, minute, or second!");
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((0 > hour || hour > 23) && (0 > minute || minute > 59) && (0 > second || second > 59)) {
            System.out.println("Invalid hour, minute, or second!");
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        appendTime(build, hour);
        build.append(":");
        appendTime(build, minute);
        build.append(":");
        appendTime(build, second);
        return build.toString();
    }

    public void appendTime(StringBuilder build, int time) {
        if (time < 10) {
            build.append("0").append(time);
        } else {
            build.append(time);
        }
    }

    public MyTime nextSecond() {
        if (second == 59) {
            second = 0;
            nextMinute();
        } else {
            second += 1;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            nextHour();
        } else {
            minute += 1;
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
        } else {
            hour += 1;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            previousMinute();
        } else {
            second -= 1;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
            previousHour();
        } else {
            minute -= 1;
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            hour = 23;
        } else {
            hour -= 1;
        }
        return this;
    }
}
