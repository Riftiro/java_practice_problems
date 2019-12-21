package rock_paper_scissors;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class RockyV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String weapons[] = {"rock","paper","scissors"};
        print("Welcome to rock, paper, scissors!\nPlease select a weapon\n1 = Rock\n2 = Paper\n3 = Scissors");
        int humanSelection = scanner.nextInt() - 1;
        int botSelection = rand.nextInt(3);    
        String outcomes[] = {"You both chose " + weapons[botSelection] + "! You canceled out each other's hits!", "You killed your opponent!", "Your opponent killed you!"};

        if(humanSelection==0) {
            if(botSelection==0){
                System.out.println(outcomes[0]);
            }else if(botSelection==1){
                System.out.println(outcomes[1]);
                
            }
        }
    }
    
    public static void print(String text) {
        System.out.println(text);
    }
}