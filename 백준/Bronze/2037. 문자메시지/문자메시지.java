import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int time = 0;
        int before = 0;

        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            int press = 0;
            int btn = 0;

            if (now == ' ') { 
                btn = 1; press = 1; 
            }
            else if (now <= 'C') { 
                btn = 2; press = now - 'A' + 1; 
            }
            else if (now <= 'F') { 
                btn = 3; press = now - 'D' + 1;
            }
            else if (now <= 'I') { 
                btn = 4; press = now - 'G' + 1; 
            }
            else if (now <= 'L') { 
                btn = 5; press = now - 'J' + 1; 
            }
            else if (now <= 'O') { 
                btn = 6; press = now - 'M' + 1; 
            }
            else if (now <= 'S') { 
                btn = 7; press = now - 'P' + 1; 
            }
            else if (now <= 'V') { 
                btn = 8; press = now - 'T' + 1; 
            }
            else { 
                btn = 9; press = now - 'W' + 1; 
            }
            if (i > 0 && before == btn && btn != 1) {
                time += w;
            }
            
            time += press * p;
            before = btn;
        }
        
        System.out.println(time);
    }
}