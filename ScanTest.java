package OpenChanllenge2;

import java.util.Scanner; //import�� �ʿ�

public class ScanTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner ��ü ����
		String name;
		int Math;
		int Eng;
		int Sum;
		
		System.out.print("����� �̸���?");
		name = scanner.next();
				
		System.out.print("����������?");
		Math = scanner.nextInt();
		
		System.out.print("����������?");
		Eng = scanner.nextInt();
		
		Sum = Math + Eng;
		
		System.out.println(name+"�� ���������� ���������� ����: "+Sum);
	}
}
