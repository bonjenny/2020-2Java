package week06;

public class ex07 {
	public static void main(String args[]) {
		
		int su[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double avg = 0.0;
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		
		for (int k = 0; k < 10; k++) {
			int i = (int)(Math.random()*10 + 1);
			su[k] = i;
			avg += (double)su[k];
			System.out.print(su[k] + " ");
		}
		
		System.out.println("");
		avg /= 10;
		System.out.print("Æò±ÕÀº " + avg);
		
	}
}