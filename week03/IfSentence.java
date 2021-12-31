package week03;

import java.util.Scanner;
public class IfSentence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("윤년 여부를 출력하는 프로그램입니다.");
		System.out.printf("연도를 입력하세요: ");
		int year = scanner.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0)
			System.out.println(year + "년은 윤년입니다.");
		else if (year % 400 == 0)
			System.out.println(year + "년은 윤년입니다.");
		else
			System.out.println(year + "년은 윤년이 아닙니다.");
		
		scanner.close();
		
	}

}
