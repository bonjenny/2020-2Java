import java.util.Scanner;
public class mid1_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double a = scanner.nextDouble();
		a = a/1.0;
		double b = scanner.nextDouble();
		b= b/1.0;
		double r = scanner.nextDouble();
		r = r/1.0;
		
		System.out.print("�� �Է�>>");
		double x = scanner.nextDouble();
		x = x/1.0;
		double y = scanner.nextDouble();
		y = y/1.0;
		
		//���� �߽ɿ��� �������� �Ÿ�
		double d = Math.sqrt(Math.pow((a - x), 2) + Math.pow((b - y), 2));
		
		if (d <= r) System.out.print("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");		
		else System.out.print("�� (" + x + ", " + y + ")�� �� �ȿ� ���� �ʴ�.");

		
		scanner.close();
	}
}