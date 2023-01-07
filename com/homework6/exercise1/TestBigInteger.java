package com.homework6.exercise1;

import java.math.BigInteger;

//Exercise 1.1. Using JDK's BigInteger Class
public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger int1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger int2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println("Add 2 big integer: " + int1.add(int2));
        System.out.println("Multiply 2 big integer: " + int1.multiply(int2));
    }
}
