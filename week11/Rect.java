final class Rect {
	final protected int x = 5;
	final public void f() {
		//x++; -> 1. x�� ���, ���൵�� �� ���� �Ұ�
		System.out.print(x);
	}
}
/*
class SpecialRect extends Rect { //SpecialRect�� Rect�� ��ӹ޴´�. -> 2. ��ӺҰ�
	public void f() { // -> 3. �������̵� �Ұ� 
		System.out.print(super.x); //super.x�� Rect�� x
	}
}
*/