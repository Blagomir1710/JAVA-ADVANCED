import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i <= n ; i++) {
            String [] commands = scanner.nextLine().split(" ");
            String commandsType = commands[0];


            switch (commandsType){
                case "1" :
                  int numberToPush = Integer.parseInt(commands[1]);

//                    if (!stack.isEmpty() && numberToPush < stack.peek()) {
//                        stack.push(stack.peek());
//                    } else {
                        stack.push(numberToPush);
//                    }
                  break;
                case "2":
                   stack.pop();
                   break;
                case "3":
//                    while(!stack.isEmpty()){
//                        int currentNumber = stack.pop();
//                        if(currentNumber > maxNumber){
//                            maxNumber = currentNumber;
//
//                        }
//                    }
                    System.out.println(Collections.max(stack));
                    break;

            }

        }

    }
}
