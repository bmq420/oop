package expression;

public class Operand implements Evaluable {
    private double data;

    public Operand(double value) {
        this.data = value;
    }

    @Override
    public double evaluate() {
        return data;
    }

}
