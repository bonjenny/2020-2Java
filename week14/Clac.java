import java.util.Scanner;

abstract class Calculator {
	int a, b;
	public abstract void setValue(int a, int b);
	public abstract int calculate();
}

class Add extends Calculator {
	int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	};
	public int calculate() {
		return a + b;
	};
}

class Sub extends Calculator {
	int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	};
	public int calculate() {
		return a - b;
	};
}

class Mul extends Calculator {
	int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	};
	public int calculate() {
		return a * b;
	};
}

class Div extends Calculator {
	int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	};
	public int calculate() {
		return a / b;
	};
}

class Calc {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		
        switch (operator) {
        case '+':
            Add add = new Add();
            add.setValue(x, y);
            System.out.println(add.calculate());
            break;

        case '-':
        	Sub sub = new Sub();
            sub.setValue(x, y);
            System.out.println(sub.calculate());
            break;

        case '*':
        	Mul mul = new Mul();
            mul.setValue(x, y);
            System.out.println(mul.calculate());
            break;

        case '/':
        	Div div = new Div();
            div.setValue(x, y);
            System.out.println(div.calculate());
            break;
        }
        
        scanner.close();
	}
}
