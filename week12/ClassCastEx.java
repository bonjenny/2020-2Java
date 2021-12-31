public class ClassCastEx {
    public static void main(String[] args) {
        A a = new B();
        B b = (B)a;
        if (a instanceof B)
            System.out.print("Go");
        if (b instanceof A)
            System.out.print("STOP");
    }
}