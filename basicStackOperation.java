import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class basicStackOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int numbersToPush = commands[0];
        int numbersToPop = commands[1];
        int numbersToCheck = commands[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int smallestElement = Integer.MAX_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbersToPush; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("0");
            return;
        } else if (stack.contains(numbersToCheck)) {
            System.out.println("true");
            return;
        } else {
            while (!stack.isEmpty()) {
                int currentNumber = stack.pop();
                if (smallestElement > currentNumber) {
                    smallestElement = currentNumber;
                }
            }

        }

        System.out.println(smallestElement);
    }
}
