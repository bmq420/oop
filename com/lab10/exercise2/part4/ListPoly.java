package com.lab10.exercise2.part4;
import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        this.coefficients = new ArrayList<>();
        for (int i = 0; i < coeffs.length; i++)  {
            this.coefficients.add(coeffs[i]);
        }
    }

    @Override
    public int degree() {
        return coefficients.size();
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] result = new double[coefficients.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }
}
