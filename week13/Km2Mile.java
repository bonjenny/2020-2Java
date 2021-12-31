import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString(); // 추상 메소드
	abstract protected String getDestString(); // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

public class Km2Mile extends Converter {
	public Km2Mile(double rate) {
		ratio = rate;
	}
	
	@Override
	protected double convert(double src) { // 추상 메소드 구현
		src = src/ratio;
		return src;
	}
	
	@Override
	protected String getSrcString() { // 추상 메소드 구현
		String Km = "Km";
		return Km;
	}
	
	@Override
	protected String getDestString() { // 추상 메소드 구현
		String mile = "mile";
		return mile;
	}
	
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6); //1마일은 1.6km
		toMile.run();
	}
}