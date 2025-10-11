public class Varible {
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 10000;
        int intVar = 1000000000;
        long longVar = 1000000000000000000L; // 默认整数为 int 类型，即便声明为 long，添加 L 显式声明为 long

        float floatVar = 1.111F; // 默认小数为 double 类型，添加 F 显式声明为 float
        double doubleVar = 1.11111111;

        boolean booleanVar = true;

        char charVar = 'A'; // 仅允许单个字符
        char wordChar = '好';

        final int intFixed = 10;
        intVar = 12;
//        intFixed = 12;

        System.out.println((int) charVar);
        System.out.println("Unicode 70 is " + (char) 70);
    }
}
