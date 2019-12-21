package rock_paper_scissors;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class RockyV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        print("Welcome to rock, paper, scissors!\nPlease select a weapon\n1 = Rock\n2 = Paper\n3 = Scissors");
    }
    
    public static void print(String text) {
        System.out.println(text);
    }
}