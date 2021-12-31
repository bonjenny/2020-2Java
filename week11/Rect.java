final class Rect {
	final protected int x = 5;
	final public void f() {
		//x++; -> 1. x는 상수, 실행도중 값 변경 불가
		System.out.print(x);
	}
}
/*
class SpecialRect extends Rect { //SpecialRect는 Rect를 상속받는다. -> 2. 상속불가
	public void f() { // -> 3. 오버라이딩 불가 
		System.out.print(super.x); //super.x는 Rect의 x
	}
}
*/