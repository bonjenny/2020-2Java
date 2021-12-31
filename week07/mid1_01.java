import java.util.Scanner;
public class mid1_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = scan.nextInt();
		double dollar = (double)money/1100.0;
		
		System.out.println(money + "원은 $" + dollar + 
				"입니다.");
		scan.close();
	}
}