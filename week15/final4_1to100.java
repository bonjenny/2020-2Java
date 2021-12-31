public class final4_1to100 {
	public static void main(String[] args) {
		
		int lcv = 0;
		int sum = 0;
		for(lcv = 1; lcv <= 100; lcv++) {
			sum += lcv;
			if(sum >= 3000) {
				System.out.println("합이 3000이 넘을 때의 합의 값 : " + sum);
				System.out.println("합이 3000을 넘게 만든 수 : " + lcv);
				break;
			}
		}
	}
}