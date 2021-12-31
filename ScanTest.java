package OpenChanllenge2;

import java.util.Scanner; //import문 필요

public class ScanTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		String name;
		int Math;
		int Eng;
		int Sum;
		
		System.out.print("당신의 이름은?");
		name = scanner.next();
				
		System.out.print("수학점수는?");
		Math = scanner.nextInt();
		
		System.out.print("영어점수는?");
		Eng = scanner.nextInt();
		
		Sum = Math + Eng;
		
		System.out.println(name+"의 수학점수와 영어점수의 합은: "+Sum);
	}
}
