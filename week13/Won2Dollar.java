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

public class Won2Dollar extends Converter {
	
	public Won2Dollar(int rate) {
		ratio = rate;
	}
	
	@Override
	protected double convert(double src) { // �߻� �޼ҵ� ����
		src = src/ratio;
		return src;
	}
	
	@Override
	protected String getSrcString() { // �߻� �޼ҵ� ����
		String Won = "��";
		return Won;
	}
	
	@Override
	protected String getDestString() { // �߻� �޼ҵ� ����
		String Dollar = "�޷�";
		return Dollar;
	}
	
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); //1�޷��� 1200��
		toDollar.run();
	}
}