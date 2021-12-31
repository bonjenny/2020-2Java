package week04;

import java.util.Scanner;
public class SwitchToIf {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100): ");
		
		int score = scanner.nextInt();
		
		if (((score/10) == 10) || ((score/10) == 9)) {
			//score는 90~100
			grade = 'A';
		}
		else if (((score/10) == 8)) {
			//score는 80~89
			grade = 'B';
		}
		else if (((score/10) == 7)) {
			//score는 70~79
			grade = 'C';
		}
		else if (((score/10) == 6)) {
			//score는 60~69
			grade = 'D';
		}
		else {
			//score는 59 이하
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
	}
}