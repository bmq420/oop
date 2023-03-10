package vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = data;
    }

    @Override
    public void append(double value) {
        /* TODO */
        this.data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        this.data.add(index, value);
    }

    @Override
    public void remove(int index) {
        /* TODO */
        this.data.remove(index);
    }

    @Override
    public int length() {
        /* TODO */
        return data.size();
    }

    @Override
    public double magnitude() {
        /* TODO */
        double sum = 0;
        for (double element : this.data) {
            sum += element * element;
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ListVector another) {
        /* TODO */
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        double sum = 0;
        for (int i = 0; i < this.length(); i++) {
            double difference = this.data.get(i) - another.data.get(i);
            sum += difference * difference;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] elements = new double[this.length()];
        for (int i = 0; i < this.length(); i++) {
            elements[i] = this.data.get(i);
        }
        return elements;
    }

    public double element(int index) {
        /* TODO */
        return this.data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.data.get(i) - another.data.get(i));
        }
        return new ListVector(result);
    }

    public ListVector plus(ListVector another) {
        /* TODO */
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.data.get(i) + another.data.get(i));
        }
        return new ListVector(result);
    }

    public ListVector scale(double factor) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.data.get(i) * factor);
        }
        return new ListVector(result);
    }

    public double dot(ListVector another) {
        /* TODO */
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        double sum = 0;
        for (int i = 0; i < this.length(); i++) {
            sum += this.data.get(i) * another.data.get(i);
        }
        return sum;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder build = new StringBuilder();
        build.append("[");
        for (int i = 0; i < this.length(); i++) {
            build.append(this.data.get(i));
            if (i < this.length() - 1) {
                build.append(", ");
            }
        }
        build.append("]");
        return build.toString();
    }
}
