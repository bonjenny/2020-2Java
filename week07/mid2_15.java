import java.util.Scanner;
import java.util.InputMismatchException;

public class mid2_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("곱하고자 하는 두 수 입력>>");
		while(true) {
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.nextLine();
				continue;
			}
			break;
		}
		scanner.close();
	}
}