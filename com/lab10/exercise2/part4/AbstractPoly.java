package com.lab10.exercise2.part4;
import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] result = new double[degree() - 1];
        for (int i = 0; i < degree() - 1; i++) {
            result[i] = coefficients()[i + 1] * (i + 1);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null || o == null) {
            return false;
        }
        AbstractPoly absPoly = (AbstractPoly) o;
        for (int i = 0; i < degree(); i++) {
            if (this.coefficients()[i] != absPoly.coefficients()[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (coefficients()[0] != 0)
            result.append(coefficients()[0]).append(" + ");

        for (int i = 1; i < degree(); i++) {
            if (i == 1) {
                result.append(coefficients()[i]).append(" * x").append(" + ");
            } else {
                result.append(coefficients()[i]).append(" * x^").append(i).append(" + ");
            }
        }
        result.replace(result.length() - 3, result.length() - 1, "");
        return result.toString();
    }
}
