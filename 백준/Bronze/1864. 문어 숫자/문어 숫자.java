import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String S = sc.nextLine();
			
			if(S.equals("#")) {
				break;
			}
			
			int result = 0;
			
			for(int i = 0; i < S.length(); i++) {
				int value;
				
				if(S.charAt(i) == '-') {
					value = 0;
				}
				else if(S.charAt(i) == '\\') {
					value = 1;
				}
				else if(S.charAt(i) == '(') {
					value = 2;
				}
				else if(S.charAt(i) == '@') {
					value = 3;
				}
				else if(S.charAt(i) == '?') {
					value = 4;
				}
				else if(S.charAt(i) == '>') {
					value = 5;
				}
				else if(S.charAt(i) == '&') {
					value = 6;
				}
				else if(S.charAt(i) == '%') {
					value = 7;
				}
				else {
					value = -1;
				}
				result = result * 8 + value;
			}
			
			System.out.println(result);
		}
	}
}