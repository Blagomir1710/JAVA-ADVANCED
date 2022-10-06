import org.xml.sax.helpers.ParserAdapter;

import java.nio.charset.CharacterCodingException;
import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class infixPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        ArrayDeque<String> stack = new ArrayDeque<String>();
        int counterNumbers = 0;
        int counterOperators = 0;

        for (int i = 0; i < symbols.length; i++) {
            char currentSymbol = symbols[i];
            String operators = "" + currentSymbol;
            String numbers = "" + currentSymbol;

            if (Character.isDigit(currentSymbol)) {
                queue.offer(Integer.parseInt(numbers));
                counterNumbers++;
            } else if (operators.equals("+") || operators.contains("-")
                    || operators.equals("/") || operators.equals("*")) {
                stack.push(operators);
                counterOperators++;
            }

            }

        for (int j = 0; j < counterNumbers; j++) {
            System.out.print(queue.poll() + " ");
        }
        for (int k = 0; k < counterOperators; k++) {
            System.out.print(stack.pop() + " ");


        }

        }

    }



