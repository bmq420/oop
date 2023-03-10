package expression;

public class Expression implements Evaluable {
    private Evaluable leftOperand;
    private Evaluable rightOperand;
    private Operator operator;

    public Expression(Evaluable leftOperand, Evaluable rightOperand, Operator operator) {
        /* TODO */
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public double evaluate() {
        /* TODO */
        return operator.doOperation(leftOperand, rightOperand);
    }
}
