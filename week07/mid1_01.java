import java.util.Scanner;
public class mid1_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = scan.nextInt();
		double dollar = (double)money/1100.0;
		
		System.out.println(money + "���� $" + dollar + 
				"�Դϴ�.");
		scan.close();
	}
}