import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int yuwenIndex = 0;
        int shuxueIndex = 1;
        int yingyuIndex = 2;

        String[] classNames = new String[3];

        classNames[yuwenIndex] = "语文";
        classNames[shuxueIndex] = "数学";
        classNames[yingyuIndex] = "英语";

        Scanner scanner = new Scanner(System.in);

        System.out.println("需要保存几个年份的成绩？");

        int years = scanner.nextInt();

        double[][] scores = new double[years][classNames.length];

        for(int i = 0; i < years; i++) {
            for(int j = 0; j < classNames.length; j++) {
                scores[i][j] = 50 + Math.random() * 50;
            }
        }

        System.out.println("想要查看哪一年的成绩？");

        int checkYear = scanner.nextInt();
        int checkYearIndex = checkYear - 1;

        System.out.println(
             "第" + checkYear + "年的各项成绩为：" +
                     classNames[yuwenIndex] + scores[checkYearIndex][yuwenIndex] + "," +
                     classNames[shuxueIndex] + scores[checkYearIndex][shuxueIndex] + "," +
                     classNames[yingyuIndex] + scores[checkYearIndex][yuwenIndex]
        );
    }
}
