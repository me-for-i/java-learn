public class InitializationExecutionOrder {
    // 静态变量
    public static int staticVar = 1;
    // 实例变量
    public int instanceVar = 2;

    // 静态初始化块
    static {
        System.out.println("执行静态初始化块 1");
        staticVar = 3;
    }

    static {
        System.out.println("执行静态初始化块 2");
        staticVar = 5;
    }

    // 实例初始化块
    {
        System.out.println("执行实例初始化块");
        instanceVar = 4;
    }

    // 构造方法
    public InitializationExecutionOrder() {
        System.out.println("执行构造方法");
    }

    public static void main(String[] args) {
        System.out.println("执行main方法");

        InitializationExecutionOrder e1 = new InitializationExecutionOrder();
        InitializationExecutionOrder e2 = new InitializationExecutionOrder();

        System.out.println("e1的静态变量：" + staticVar);
        System.out.println("e1的实例变量：" + e1.instanceVar);
        System.out.println("e2的静态变量：" + staticVar);
        System.out.println("e2的实例变量：" + e2.instanceVar);
    }
}

class Father{
    public Father() {
        System.out.println(++b1+"父类构造方法");
    }//父类构造方法 第四
    static int a1=0;//父类static 第一 注意顺序
    static {
        System.out.println(++a1+"父类static");
    }
    int b1=a1;//父类成员变量和代码块 第三
    {
        System.out.println(++b1+"父类代码块");
    }
}
class Son extends Father{
    public Son() {
        System.out.println(++b2+"子类构造方法");
    }//子类构造方法 第六
    static {//子类static第二步
        System.out.println(++a1+"子类static");
    }
    int b2=b1;//子类成员变量和代码块 第五
    {
        System.out.println(++b2 + "子类代码块");
    }
}
 class test9 {
    public static void main(String[] args) {
        Son son=new Son();
    }
}