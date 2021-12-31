import java.util.Scanner;
public class final1_scanner {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.print("정수를 입력하세요>> ");
			int num = scan.nextInt();
			int lcv = 0;
			
			for (lcv = 0; lcv < num; lcv++) {
				System.out.print("*");
			}
			scan.close();
		}
	}
}