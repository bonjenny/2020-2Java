import java.util.Scanner;
public class Grade {
	
	private static int math;
	private static int science;
	private static int english;
	
	public double average() {
		int sum = math + science + english;
		double avg = (double)sum/3;
		return avg;
	}
	
	public Grade() {}
	
	public Grade(int i, int j, int k) {
		math = i;
		science = j;
		english = k;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+me.average()); //average()�� ����� ����Ͽ� ����
		
		scanner.close();
	}
}