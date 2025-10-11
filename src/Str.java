public class Str {
    public static void main(String[] args) {
        String s = "111";

        if (s.equals("111"))
            System.out.println(true);

        String line = "";
        for (int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++){
                line += i + "*" + j + "=" + i * j + "\t";

                if(i==j){
                    System.out.println(line);
                    line = "";
                    break;
                }
            }
        }
    }
}
