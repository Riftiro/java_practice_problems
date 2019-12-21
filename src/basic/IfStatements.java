package basic;
import java.util.Scanner;

public class IfStatements {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please select a problem");
    int x = scanner.nextInt();
    if(x==1) {
      Problem_One();
    }else if(x==2){
      Problem_Two();
    }else if(x==3){
      Problem_Three();
    }

 

  }

  public static void Problem_One(){
        // 1. Get number as input, print whether the number is greater than 2
    /*
    Test Input:
      2
    Expected Output:
      false
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("(Event 1) \nEnter a number.");
    int x = scanner.nextInt();
    if(x > 2){
      System.out.println("The number, " + x +" is greater than 2");
    }else if(x<2) {
      System.out.println("The number, " + x + " is less than 2");
    }else if(x==2) {
      System.out.println("The number that you just input was 2");
    }
  }
  public static void Problem_Two(){
       // 2. Get number as input, print whether the number is even
    /*
    Test Inputs:
      2
      3
    Expected Outputs:
      true
      false
    */
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("\n\n\n(Event 2) \nEnter a number.");
    int y = scanner.nextInt();
    int z = 2;
    int a = y%z;
    if(a == 1){
      System.out.println("\nThe number isn't even");
    }else{
      System.out.println("\nThe number is even");
    }
  }

  public static void Problem_Three(){
        // 3. Get 2 numbers as input, print whether the 2 numbers are equal to eachother
    /*
    Test Inputs:
      2
      3
      ...
      4
      4
    Expected Outputs:
      false
      ...
      true
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n\n(Event 3) \nInput value for x");
    int x = scanner.nextInt();
    System.out.println("\nInput value for y");
    int y = scanner.nextInt();
    if(!(x==y)){
      System.out.println("X is not equal to Y");
    }else if(x==y){
      System.out.println("X is equal to Y");
    }
  }
}