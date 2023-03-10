package ThiGiuaKy_D2;

import java.math.BigInteger;

public class MyMath {
    public double cos(double value) {
        return cos(value, 100);
    }

    public double cos(double xValue, int numTerms) {
        double cosResult = 0;
        int position = 0;
        for (int i = 0; i < numTerms; i++) {
            if (position % 4 == 0) {
                cosResult += calElement(xValue, position);
            } else {
                cosResult -= calElement(xValue, position);
            }
            position += 2;
        }
        return cosResult;
    }

    public double calElement(double xValue, int position) {
        double result = 1;
        if (position == 0) {
            return result;
        }
        for (int i = position; i > 0; i--) {
            result *= xValue / i;
        }
        return result;
    }

    public double exp(double value) {
        double result = 0;
        for (int i = 0; i < 100; i++) {
            result += calExpElement(value, i);
        }
        return result;
    }

    public double calExpElement(double value, int position) {
        double result = 1;
        if (position == 0) {
            return result;
        }
        for (int i = position; i > 0; i--) {
            result *= value / i;
        }
        return result;
    }

    public BigInteger val(char c) {
        if (c >= '0' && c <= '9') {
            return BigInteger.valueOf(c - '0');
        } else {
            return BigInteger.valueOf(c - 'A' + 10);
        }
    }

    public String toDecimal(String value, int rad) {
        value = value.toUpperCase();
        int length = value.length();
        BigInteger power = BigInteger.ONE;
        BigInteger num = BigInteger.ZERO;

        for (int i = length - 1; i >= 0; i--) {
            if (val(value.charAt(i)).compareTo(BigInteger.valueOf(rad)) >= 0) {
                System.out.println("Invalid number");
                return null;
            }

            num = num.add(val(value.charAt(i)).multiply(power));
            power = power.multiply(BigInteger.valueOf(rad));
        }

        return num.toString();
    }

    public char reVal(int num) {
        if (num >= 0 && num <= 9) {
            return (char)(num + 48);
        } else {
            return (char)(num - 10 + 65);
        }
    }

    public String decimalTo(String value, int rad) {
        StringBuilder s = new StringBuilder();
        BigInteger intValue = new BigInteger(value);
        while (intValue.compareTo(BigInteger.ZERO) > 0) {
            s.append(reVal(intValue.mod(BigInteger.valueOf(rad)).intValue()));
            intValue = intValue.divide(BigInteger.valueOf(rad));
        }
        return s.reverse().toString();
    }

    public String toRadix(String value, int inRad, int outRad) {
        String result = toDecimal(value, inRad);
        return decimalTo(result, outRad);
    }

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.exp(2.2) * myMath.cos(3.3));
        System.out.println(myMath.toRadix("123456789123456789", 13, 8));
    }
}
