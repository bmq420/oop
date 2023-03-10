package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
         data = new double[1];
    }

    public ArrayVector(double[] coefficients) {
        /* TODO */
        this.data = coefficients;
        this.length = coefficients.length;
    }

    /*
    * Hàm tăng số phần tử của mảng lên gấp đôi.
    * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
    * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
    * sau đó copy những phần tử của mảng cũ sang mảng mới.
    */
    private void extend() {
        /* TODO */
        double[] newData = new double[this.length * 2];
        for (int i = 0; i < this.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    /*
    * Hàm thêm một phần tử vào cuối vector.
    * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
    * thì cần phải cấp phát một mảng lớn hơn.
    */
    @Override
    public void append(double value) {
        /* TODO */
        if (this.length == this.data.length) {
            this.extend();
        }
        this.data[this.length] = value;
        this.length++;
    }

    /*
     * Hàm thêm một phần tử vào vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index > this.length) {
            throw new IndexOutOfBoundsException("Cannot insert element at index " + index);
        }

        if (this.length == this.data.length) {
            this.extend();
        }
        for (int i = this.length - 1; i >= index; i--) {
            this.data[i + 1] = this.data[i];
        }
        this.data[index] = value;
        this.length++;
    }

    /*
    * Hàm xóa một phần tử của vector ở vị trí index.
    */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index >= this.length) {
            throw new IndexOutOfBoundsException("Cannot remove element at index " + index);
        }

        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.length--;
    }

    @Override
    public int length() {
        /* TODO */
        return this.length;
    }

    @Override
    public double magnitude() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            sum += this.data[i] * this.data[i];
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ArrayVector another) {
        /* TODO */
        if (this.length != another.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            double difference = this.data[i] - another.data[i];
            sum += difference * difference;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        /* TODO */
        return Arrays.copyOf(this.data, this.length);
    }

    @Override
    public double element(int index) {
        /* TODO */
        if (index < 0 || index >= this.length) {
            throw new IndexOutOfBoundsException("Index must be smaller than length of vector minus 1 and bigger than 0");
        }
        return this.data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        /* TODO */
        if (this.length != another.length) {
            throw new IndexOutOfBoundsException("Index must be smaller than length of vector minus 1 and bigger than 0");
        }

        double[] result = new double[this.length];
        for (int i = 0; i < this.length; i++) {
            result[i] = this.data[i] - another.data[i];
        }
        return new ArrayVector(result);
    }

    public ArrayVector plus(ArrayVector another) {
        /* TODO */
        if (this.length != another.length) {
            throw new IndexOutOfBoundsException("Index must be smaller than length of vector minus 1 and bigger than 0");
        }

        double[] result = new double[this.length];
        for (int i = 0; i < this.length; i++) {
            result[i] = this.data[i] + another.data[i];
        }
        return new ArrayVector(result);
    }

    public ArrayVector scale(double factor) {
        /* TODO */
        double[] result = new double[this.length];
        for (int i = 0; i < this.length(); i++) {
            result[i] = this.data[i] * factor;
        }
        return new ArrayVector(result);
    }

    public double dot(ArrayVector another) {
        /* TODO */
        if (this.length != another.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            sum += this.data[i] * another.data[i];
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
            build.append(this.data[i]);
            if (i < this.length() - 1) {
                build.append(", ");
            }
        }
        build.append("]");
        return build.toString();
    }
}
