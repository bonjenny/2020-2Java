package week06;

public class ex13 {
	public static void main(String[] args) {
		
		for (int i = 3; i <= 99; i = i +3) {
			if (i/10 == 3  || i/10 == 6|| i/10 == 9) {
				System.out.println(i + "ดย ยฆยฆ");
			}
			else {
				System.out.println(i + "ดย ยฆ");
			}
		}
		
	}
}