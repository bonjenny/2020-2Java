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
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+me.average()); //average()는 평균을 계산하여 리턴
		
		scanner.close();
	}
}