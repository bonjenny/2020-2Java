package week05;

import java.util.Scanner;
public class ScanInt {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>> ");
		int n = scanner.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}		
		
		scanner.close();
		
	}
}