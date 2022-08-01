import java.util.Random;
import java.util.*;

public class rockPaperScissor {
    public static void main(String[] args) {
        Random r1 = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets start the game:");

        int count = 0;

        String ch;
        do {
            System.out.println("Choose :: 0 for rock :: 1 for paper :: 2 for scissor");
            for (int i = 1; i <= 5; i++) {
                int input = sc.nextInt();
                int val = r1.nextInt(3);
                if (input<=2)
                {
                    if (val == input) {
                        System.out.println("draw");
                    } else if (val == 0 && input == 1)               //user paper and com rock
                    {
                        count++;
                        System.out.println("Score: " + count);
                    } else if (val == 0 && input == 2)                 //user scissor and com rock
                    {
                        System.out.println("Computer won");
                    } else if (val == 1 && input == 0)                 //user rock and com paper
                    {
                        System.out.println("Computer won");
                    } else if (val == 1 && input == 2)                  //user scissor and com paper
                    {
                        count++;
                        System.out.println("Score: " + count);
                    } else if (val == 2 && input == 0)                   //user rock and com scissor
                    {
                        count++;
                        System.out.println("Score: " + count);
                    } else if (val == 2 && input == 1)                  //user paper and com scissor
                    {
                        System.out.println("Computer won");
                    }


                }
                else {
                    System.out.println("Wrong Choice");
                }
            }
            System.out.println("total score:" + count);
            System.out.println("If you want to play again choose Y else N");
            ch = sc.next();

        } while (Objects.equals(ch, "Y"));

    }
}
