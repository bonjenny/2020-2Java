package week04;

import java.util.Scanner;
public class SwitchToIf {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��ϼ���(0~100): ");
		
		int score = scanner.nextInt();
		
		if (((score/10) == 10) || ((score/10) == 9)) {
			//score�� 90~100
			grade = 'A';
		}
		else if (((score/10) == 8)) {
			//score�� 80~89
			grade = 'B';
		}
		else if (((score/10) == 7)) {
			//score�� 70~79
			grade = 'C';
		}
		else if (((score/10) == 6)) {
			//score�� 60~69
			grade = 'D';
		}
		else {
			//score�� 59 ����
			grade = 'F';
		}
		System.out.println("������ " + grade + "�Դϴ�.");
		scanner.close();
	}
}