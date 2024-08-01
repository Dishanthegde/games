package dishant;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int numberofguesses = 0;
    game(){
        Random ran = new Random();
        this.number = ran.nextInt(100) ;
    }

    public int getnofguesses(){
        return numberofguesses;
    }
    
    public void setnoofguesses(){
        this.numberofguesses = numberofguesses;
    }


    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber(){
        numberofguesses++;
        if (inputnumber == number){
            System.out.format("yes u guessed it right at %d try ", numberofguesses);
            return true;
        }
        else if (inputnumber< number){
            System.out.println("its too low");
        }
        else if (inputnumber> number){
            System.out.println("its too high");
        }
        return false;
    }
}

public class game2 {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
        g.takeuserinput();
        b = g.iscorrectnumber();
        System.out.println(b);
        }
    }
}
