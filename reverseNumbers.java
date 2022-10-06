import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class reverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);

        }

        for (Integer integer : stack) {
            System.out.print(stack.pop() + " ");
        }

        }

    }

