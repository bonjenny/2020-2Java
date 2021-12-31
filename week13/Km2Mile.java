import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String getSrcString(); // �߻� �޼ҵ�
	abstract protected String getDestString(); // �߻� �޼ҵ�
	protected double ratio; // ����
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ���: " + res + getDestString() + "�Դϴ�");
		scanner.close();
	}
}

public class Km2Mile extends Converter {
	public Km2Mile(double rate) {
		ratio = rate;
	}
	
	@Override
	protected double convert(double src) { // �߻� �޼ҵ� ����
		src = src/ratio;
		return src;
	}
	
	@Override
	protected String getSrcString() { // �߻� �޼ҵ� ����
		String Km = "Km";
		return Km;
	}
	
	@Override
	protected String getDestString() { // �߻� �޼ҵ� ����
		String mile = "mile";
		return mile;
	}
	
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6); //1������ 1.6km
		toMile.run();
	}
}