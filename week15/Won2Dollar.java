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

public class Won2Dollar extends Converter {
	
	public Won2Dollar(int rate) {
		ratio = rate;
	}
	
	@Override
	protected double convert(double src) { // 추상 메소드 구현
		src = src/ratio;
		return src;
	}
	
	@Override
	protected String getSrcString() { // 추상 메소드 구현
		String Won = "원";
		return Won;
	}
	
	@Override
	protected String getDestString() { // 추상 메소드 구현
		String Dollar = "달러";
		return Dollar;
	}
	
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); //1달러는 1200원
		toDollar.run();
	}
}