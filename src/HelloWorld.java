import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        HelloWorld newWorld = new HelloWorld("Hello World Class main function");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
        int age = in.nextInt();
        System.out.println(age);
    }

    public HelloWorld(String creator){
        System.out.println("creator is " + creator);
    }


}
