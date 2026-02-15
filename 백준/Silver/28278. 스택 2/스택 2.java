import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int instruction = sc.nextInt();
            switch (instruction) {
                case 1:
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
                    break;
                case 3:
                    sb.append(stack.size() + "\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}