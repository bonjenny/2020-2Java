package week03;

import java.util.Scanner;
public class IfSentence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���θ� ����ϴ� ���α׷��Դϴ�.");
		System.out.printf("������ �Է��ϼ���: ");
		int year = scanner.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0)
			System.out.println(year + "���� �����Դϴ�.");
		else if (year % 400 == 0)
			System.out.println(year + "���� �����Դϴ�.");
		else
			System.out.println(year + "���� ������ �ƴմϴ�.");
		
		scanner.close();
		
	}

}
