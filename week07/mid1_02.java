import java.util.Scanner;
public class mid1_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int su = scanner.nextInt();
		int sua = su/10;
		int sub = su%10;
		if(sua == sub) System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		
		scanner.close();
	}
}