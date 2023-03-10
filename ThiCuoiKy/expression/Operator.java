package expression;

public interface Operator {
    double doOperation(Evaluable leftOperand, Evaluable rightOperand);
}
