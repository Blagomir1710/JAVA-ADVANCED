import java.util.ArrayDeque;
import java.util.Scanner;

public class infixDemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] infixFormula = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String symbol : infixFormula) {

            if (Character.isLetterOrDigit(symbol.charAt(0)))
                queue.offer(symbol);

            else if (symbol.equals("("))
                stack.push(symbol);
            else if (symbol.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("("))
                    queue.offer(stack.pop());
                stack.pop();
            } else {

                while (!stack.isEmpty()
                        && getPrecedence(symbol.charAt(0))
                        <= getPrecedence(stack.peek().charAt(0)))
                    queue.offer(stack.pop());
                stack.push(symbol);
            }
        }
        while (!stack.isEmpty())
            queue.offer(stack.pop());
        while (!queue.isEmpty())
            System.out.printf("%s ", queue.poll());
    }

    static int getPrecedence(char ch) {

        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        else
            return -1;



    }
}
