package week04;

import java.util.Scanner;
public class WhileSentence {
	
	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		System.out.println("입력된 수의 합을 출력하려면 0을 입력하세요.");
		
		int n = scanner.nextInt(); //양의 정수 입력
		while (n != 0) { //0이 입력되면 while문 벗어남
			sum += n;
			count ++;
			n = scanner.nextInt(); //양의 정수 입력
		}
		
		if (count == 0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("정수의 합은 " + (double)sum + "입니다.");
		}
		scanner.close();
	}
}