import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> valueMap = new HashMap<>();
        valueMap.put("black", "0");
        valueMap.put("brown", "1");
        valueMap.put("red", "2");
        valueMap.put("orange", "3");
        valueMap.put("yellow", "4");
        valueMap.put("green", "5");
        valueMap.put("blue", "6");
        valueMap.put("violet", "7");
        valueMap.put("grey", "8");
        valueMap.put("white", "9");

        String color1 = scanner.nextLine();
        String color2 = scanner.nextLine();
        String color3 = scanner.nextLine();
        scanner.close();

        long resist = Long.parseLong(valueMap.get(color1) + valueMap.get(color2));

        int power = Integer.parseInt(valueMap.get(color3));

        long multip = 1;
        for (int i = 0; i < power; i++) {
            multip *= 10;
        }

        long result = resist * multip;

        System.out.println(result);
    }
}