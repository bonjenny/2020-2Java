package week04;

import java.util.Scanner;
public class WhileSentence {
	
	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		System.out.println("�Էµ� ���� ���� ����Ϸ��� 0�� �Է��ϼ���.");
		
		int n = scanner.nextInt(); //���� ���� �Է�
		while (n != 0) { //0�� �ԷµǸ� while�� ���
			sum += n;
			count ++;
			n = scanner.nextInt(); //���� ���� �Է�
		}
		
		if (count == 0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������ " + count + "���̸� ");
			System.out.println("������ ���� " + (double)sum + "�Դϴ�.");
		}
		scanner.close();
	}
}