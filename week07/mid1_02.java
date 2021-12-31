import java.util.Scanner;
public class mid1_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int su = scanner.nextInt();
		int sua = su/10;
		int sub = su%10;
		if(sua == sub) System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		else System.out.print("No! 10의 자리와 1의 자리가 같지 않습니다.");
		
		scanner.close();
	}
}