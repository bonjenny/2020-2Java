package week03;

import java.util.Scanner;
public class MultipleOrThree {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���: ");
		int number = in.nextInt();
		
		if (number % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		
		in.close();
		
	}

}
