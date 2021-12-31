import java.util.Scanner;

abstract class F {
	public abstract void size();
}

class B extends F {
	public void size() {
		System.out.print("small");
	};
}

class S extends F {
	public void size() {
		System.out.print("medium");
	};
}

class P extends F {
	public void size() {
		System.out.print("big");
	};
}

class M extends F {
	public void size() {
		System.out.print("very big");
	};
}

class Fruit {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("좋아하는 과일을 입력하시오(blueberry, strawberry, peach, melon 중)>> ");
		String fruit = scanner.nextLine();
		System.out.print("과일의 사이즈는: ");
		
        switch (fruit) {
        case "blueberry":
            B b = new B();
            b.size();
            break;

        case "strawberry":
        	S s = new S();
        	s.size();
            break;

        case "peach":
        	P p = new P();
        	p.size();
            break;

        case "melon":
        	M m = new M();
        	m.size();
            break;
        }
        scanner.close();
	}
}