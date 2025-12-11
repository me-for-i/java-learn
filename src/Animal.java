import java.io.IOException;

class Animal {
    public int id;
    public String name;
    public int age;
    public int weight;

    public Animal(int id, String name, int age, int weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //这里省略get set方法
    public void sayHello() {
        System.out.println("hello");
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sing() {
        System.out.println("sing");
    }
}

interface sleep {
    void sleep();
}

interface run {
    void run();
}

class Dog extends Animal implements run, sleep {
    public Dog(int id, String name, int age, int weight) {
        super(id, name, age, weight);
    }

    public void eat(String food) {
        System.out.println("I'm eating" + food);
    }

    @Override
    public void sleep() {
        System.out.println("I'm sleeping");
    }

    @Override
    public void run() {
        System.out.println("I'm running");
    }
}

class DogSayHello {
    public static void main(String[] args) {
        Dog dog = new Dog(1, "wangcai", 22, 65);
        dog.sayHello();
    }
}

class A1 {
    private void doA() {
    }

    void doB() {
    }//default

    protected void doC() {
    }

    public void doD() {
    }
}

class A2 extends A1 {

    @Override
    void doB() {
    }//继承子类重写的方法访问修饰符权限可扩大

    @Override
    protected void doC() {
    }//继承子类重写的方法访问修饰符权限可和父类一致

    @Override
    public void doD() {
    }//不可用protected或者default修饰
}

class B1 {
    public void doA() throws Exception {
    }

    public void doB() throws Exception {
    }

    public void doC() throws IOException {
    }

    public void doD() throws IOException {
    }
}

class B2 extends B1 {
    //异常范围和父类可以一致
    @Override
    public void doA() throws Exception {
    }

    //异常范围可以比父类更小
    @Override
    public void doB() throws IOException {
    }

    //异常范围 不可以比父类范围更大
    @Override
    public void doC() throws IOException {
    }//不可抛出Exception等比IOException更大的异常

    @Override
    public void doD() throws IOException {
    }
}

class C1 {
    public int a;

    public C1() {
    }

    // public static C1(){}// 构造方法不允许被声明为static
    public static void doA() {
    }

    public static void doB() {
    }
}

class C2 extends C1 {
    public static void doC()//静态方法中不存在当前对象，因而不能使用this和super。
    {
//        System.out.println(super.a);
    }

    public void doC(String C) {
    }

    public static void doA() {
    }//静态方法能被静态方法重写
//     public void doB(){}//静态方法不能被非静态方法重写
}
