package week05;

public class PrintN {
	public static void main(String args[]) {
		
		int n [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		for (int i = 0; i < n.length; i++) {//�� �� ���� �ݺ�
			for (int j = 0; j < n[i].length; j++) {//�� �ະ�� �ݺ�
				System.out.print(n[i][j] + "  ");
			}
			System.out.println("");
		}
		
	}
}