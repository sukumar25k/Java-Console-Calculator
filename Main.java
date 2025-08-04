import java.util.*;

public class Main {
    private static double prevResult = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Java Calculator");
        System.out.println("Type an expression like 5+3 or *2 (uses previous result)");
        System.out.println("Type 'q' to quit.\n");

        while (true) {
            System.out.print("Enter expression (or 'q' to exit): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("You have exited the calculator.\nBye.");
                break;
            }

            try {
                if (input.length() > 0 && "+-*/".indexOf(input.charAt(0)) != -1) {
                    input = prevResult + input;
                }

                prevResult = Helper.evaluate(input);
                System.out.println("Result: " + prevResult);
            } catch (ArithmeticException ae) {
                System.out.println("Error: Division by zero is undefined.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}

class Helper {
    public static double evaluate(String expr) {
        expr = expr.replaceAll(" ", "");
        char operator = 0;
        int index = -1;

        for (int i = 1; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("Invalid expression: operator not found.");
        }

        double num1 = Double.parseDouble(expr.substring(0, index));
        double num2 = Double.parseDouble(expr.substring(index + 1));

        if (operator == '/' && num2 == 0) {
            throw new ArithmeticException();  // caught explicitly in main
        }

        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: throw new IllegalArgumentException("Unsupported operator.");
        }
    }
}
