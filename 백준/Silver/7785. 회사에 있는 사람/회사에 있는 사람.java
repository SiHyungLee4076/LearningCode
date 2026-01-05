import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] parts = s.split(" ");
            String name = parts[0];
            String check = parts[1];

            if (check.equals("enter")) {
                map.put(name, true);
            }
            else if (check.equals("leave")) {
                map.put(name, false);
            }
        }

        List<String> result = new ArrayList<>();
        List<String> keyList = new ArrayList<>(map.keySet());

        for (int i = 0; i < keyList.size(); i++) {
            String name = keyList.get(i);
            if (map.get(name)) {
                result.add(name);
            }
        }

        Collections.sort(result, Collections.reverseOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < result.size(); i++) {
            bw.write(result.get(i) + "\n");
        }
        bw.flush();
    }
}