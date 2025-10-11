import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rangStart = 20;
        int rangEnd = 40;
        int guessTotal = 5;

        int mod = rangEnd - rangStart;
        int randNum = (int) (Math.random() * mod) + rangStart;

        int guessedNum = 0;

        boolean gameEnd = false;

        while (!gameEnd) {
            int input = in.nextInt();
            if (input == randNum) {
                System.out.println("猜中了");
                System.out.println("已猜" + guessedNum + "次，剩余" + (guessTotal - guessedNum));
                gameEnd = true;
            } else if (input < randNum) {
                System.out.println("数值偏小");
            } else {
                System.out.println("数值偏大");
            }

            if (guessedNum >= guessTotal) {
                gameEnd = true;
            } else {
                guessedNum++;
            }

        }
    }
}
