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
		
		System.out.print("�����ϴ� ������ �Է��Ͻÿ�(blueberry, strawberry, peach, melon ��)>> ");
		String fruit = scanner.nextLine();
		System.out.print("������ �������: ");
		
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