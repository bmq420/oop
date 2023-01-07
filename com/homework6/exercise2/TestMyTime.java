package com.homework6.exercise2;

//Exercise 1.2. The MyTime Class
public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Time: " + time.toString());
        time.nextSecond();
        System.out.println("Next second: " + time.toString());
        time.nextMinute();
        System.out.println("Next minute: " + time.toString());
        time.nextHour();
        System.out.println("Next hour: " + time.toString());
        time.setTime(5, 0, 0);
        System.out.println("\nSet new time: " + time.toString());
        time.previousSecond();
        System.out.println("Previous second: " + time.toString());
        time.previousMinute();
        System.out.println("Previous minute: " + time.toString());
        time.previousHour();
        System.out.println("Previous hour: " + time.toString());
        time.setTime(24, 60, 60);

    }
}
