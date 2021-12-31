import java.util.Scanner;
public class mid1_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double a = scanner.nextDouble();
		a = a/1.0;
		double b = scanner.nextDouble();
		b= b/1.0;
		double r = scanner.nextDouble();
		r = r/1.0;
		
		System.out.print("점 입력>>");
		double x = scanner.nextDouble();
		x = x/1.0;
		double y = scanner.nextDouble();
		y = y/1.0;
		
		//원의 중심에서 점까지의 거리
		double d = Math.sqrt(Math.pow((a - x), 2) + Math.pow((b - y), 2));
		
		if (d <= r) System.out.print("점 (" + x + ", " + y + ")는 원 안에 있다.");		
		else System.out.print("점 (" + x + ", " + y + ")는 원 안에 있지 않다.");

		
		scanner.close();
	}
}