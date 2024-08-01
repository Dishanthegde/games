package dishant;

import java.util.Random;
import java.util.Scanner;
public class game1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter 0 for rock,1 for paper, 2 for scissors");
            int userinput = sc.nextInt();
            
            Random random = new Random();
            int computerInput = random.nextInt( 3);
            if (userinput == computerInput){
                System.out.println("draw");
            }else if(userinput == 0 && computerInput == 2 || computerInput == 0 && userinput == 1 || userinput == 2 && computerInput == 1){
                System.out.println("you win");
            }else{
                System.out.println("computer wins");
            }
            System.out.println(computerInput);
        }
    }
}