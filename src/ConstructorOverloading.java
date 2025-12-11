public class ConstructorOverloading {
    private String name;
    private int age;

    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorOverloading(ConstructorOverloading other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void  print(){
        System.out.println(this.name+" "+this.age);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading("ME",22);
        c1.print();
        ConstructorOverloading c2 = new ConstructorOverloading(c1);
        c2.print();
    }
}
