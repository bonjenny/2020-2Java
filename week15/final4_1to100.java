public class final4_1to100 {
	public static void main(String[] args) {
		
		int lcv = 0;
		int sum = 0;
		for(lcv = 1; lcv <= 100; lcv++) {
			sum += lcv;
			if(sum >= 3000) {
				System.out.println("���� 3000�� ���� ���� ���� �� : " + sum);
				System.out.println("���� 3000�� �Ѱ� ���� �� : " + lcv);
				break;
			}
		}
	}
}