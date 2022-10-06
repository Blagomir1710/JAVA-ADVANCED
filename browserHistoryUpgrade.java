import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue= new ArrayDeque<>();

        while (!input.equals("Home")){
            if(input.equals("forward") && (queue.size() <= 1)){
                System.out.println("no next URLs");
            } else if (input.equals("forward")){
                queue.poll();
                System.out.println(queue.peek());
            } else if (input.equals("back")){
                System.out.println(queue.peek());
            } else {
                System.out.println(queue.offer(input));
            }
            input = scanner.nextLine();
        }
    }
}
