public class TestThis {
    public static void main(String[] args) {
        new InvokeCurrentClassMethod(2).printN();
    }
}

class InvokeCurrentClassMethod {
    int n;

    public InvokeCurrentClassMethod(int m) {
        n = m;
    }

    void method1() {
    }

    void method2() {
        method1();
    }

    public static void main(String[] args) {
        InvokeCurrentClassMethod m1 = new InvokeCurrentClassMethod(1);
        m1.method2();
        m1.printN();
    }

    public void printN() {
        System.out.println(n);
    }
}