

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();
        String  curre= "";


        for (int i = 1; i <= n; i++) {
            String[] commands = scanner.nextLine().split(" ");
            String command = commands[0];

            switch (command) {
                case "1":
                    String textInput = commands[1];
                    stack.push(text.append(textInput).toString());
                    break;
                case "2":
                    int eraseNumbers = Integer.parseInt(commands[1]);
                    stack.push(text.delete(text.length() - 3, text.length()).toString());
                    break;
                case "3":
                    int characterNumber = Integer.parseInt(commands[1]);
                    String currentText = stack.peek();
                    char toPrint = (currentText.charAt(characterNumber - 1));
                    System.out.println(toPrint);
                    break;
                case "4":
                    stack.pop();

                    break;
            }

        }


    }
}

