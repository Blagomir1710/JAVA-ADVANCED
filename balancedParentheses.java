import java.util.ArrayDeque;
import java.util.Scanner;

public class balancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBalanced = false;


        String[] symbols = scanner.nextLine().split("");
        ArrayDeque<String> stackFirst = new ArrayDeque<>();
        ArrayDeque<String> stackSecond = new ArrayDeque<>();

        int trueCounter = 0;
        for (int i = 0; i < symbols.length / 2; i++) {
            stackFirst.push(symbols[i]);
        }
        for (int j = symbols.length - 1; j >= symbols.length / 2; j--) {
            stackSecond.push(symbols[j]);
        }

        for (int i = 0; i < symbols.length / 2; i++) {
            String firstPop = stackFirst.pop();
            String secondPop = stackSecond.pop();

            if (firstPop.equals("(") && secondPop.equals(")")) {
                isBalanced = true;
                trueCounter++;
            }
            if (firstPop.equals("[") && secondPop.equals("]")) {
                isBalanced = true;
                trueCounter++;
            }
            if (firstPop.equals("{") && secondPop.equals("}")) {
                isBalanced = true;
                trueCounter++;
            }
        }
          if (trueCounter <= 1) {
            isBalanced = false;
        }

        if (isBalanced && stackFirst.isEmpty()&& stackSecond.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}







