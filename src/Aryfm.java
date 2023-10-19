import java.util.Stack;

public class Aryfm {

    public String expression;

    public static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                while (!operators.isEmpty() && hasHigherPrecedence(ch, operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                int number = 0;
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    if (expression.charAt(i) != '.') {
                        number = number * 10 + (expression.charAt(i) - '0');
                    }
                    i++;
                }
                i--;
                numbers.push(number);
            }
        }

        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    public static boolean hasHigherPrecedence(char op1, char op2) {
        return (op2 == '*' && (op1 == '+' || op1 == '-'));
    }

    public static int applyOperation(char operator, int b, int a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return 0;
        }
    }
}