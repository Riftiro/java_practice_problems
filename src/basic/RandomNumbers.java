package basic;

// https://www.geeksforgeeks.org/generating-random-numbers-in-java/
// https://www.geeksforgeeks.org/java-math-random-method-examples/
// https://www.geeksforgeeks.org/random-setseed-method-in-java-with-examples/

// use these links to learn more about random numbers
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

// hint
// use Math library for now

public class RandomNumbers {
  public static void testProblem() {
    System.out.println("Do you believe in me?");
  }
  public static void main(String[] args) throws Exception {

    //testProblem();
    System.out.println("Please select a problem (1-3)");
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if(x==1){
      System.out.println("You have selected problem one.");
      ProblemOne(rand);
    }else if(x==2){
      System.out.println("You have selected problem two.");
      ProblemTwo(rand);
    }else if(x==3){
      System.out.println("You have selected problem three.");
      ProblemThree(rand);
    }

    // 4. Get user input, print matching string to number
    // 1 -> "rock", 2 -> "paper", 3 -> "scissors"

    // 5. Set a seed "seed value".
    // Randomly generate a number.
    // Run program 4 times to ensure that it generates the same number each time.
  }
  public static void ProblemOne(Random rand) {
    // 1. Generate a random number and print to screen.
    int x = rand.nextInt(1000);
    System.out.println("The first random number is " + x); 
  }
  public static void ProblemTwo(Random rand) {
    // 2. Generate a random number between 1 and 3. print that number.
    int y = rand.nextInt(3);
    int z = y + 1;
    System.out.println("\n\nA random number between 1 and 3 is " +z);
  }
  public static void ProblemThree(Random rand) {
    // 3. Mental Health Therapist program:
    // Ask usere for their name?
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hi, what's your name?\n");
    String name = scanner.nextLine();
    // random print "I believe in you!" or "You suck!"
    String[] believe = {"I believe in you, " + name, "I don't believe in you, " + name + ", you suck.", "I don't believe in you, " + name + ", you suck.","I don't believe in you, " + name + ", you suck."};
    int x = rand.nextInt(4);
    System.out.println(believe[x]);
  }
}
