package expression;

public class TestExpressions {
    public static void main(String[] args) {
        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
        Evaluable operand1 = new Operand(1);
        Evaluable operand2 = new Operand(2);
        Evaluable operand3 = new Operand(3);
        Evaluable operand4 = new Operand(4);

        //addition
        Evaluable additionExpression = new Expression(operand1, operand2, new AdditionOperator());

        //multiplication
        Evaluable multiplicationExpression = new Expression(additionExpression, operand3, new MultiplicationOperator());

        //subtraction
        Evaluable subtractionExpression = new Expression(multiplicationExpression, operand4, new SubtractionOperator());

        double result = subtractionExpression.evaluate();
        System.out.println("Result: " + result);
    }
}
