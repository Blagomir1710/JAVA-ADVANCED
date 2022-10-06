import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class basicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int numberToOffer = input[0];
        int numberToPoll = input[1];
        int numberToCheck = input[2];


        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < numberToPoll; i++) {
            queue.poll();
        }

        if(queue.isEmpty()){
            System.out.println("0");
        } else if (queue.contains(numberToCheck)){
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }

    }
}
