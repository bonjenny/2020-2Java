import java.util.Scanner;
import java.util.InputMismatchException;

public class mid2_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		while(true) {
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.nextLine();
				continue;
			}
			break;
		}
		scanner.close();
	}
}