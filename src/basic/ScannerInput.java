package basic;

import java.util.Scanner;
// https://www.w3schools.com/java/java_user_input.asp
// use this link as a tutorial on how to use the Scanner class to get user input.

public class ScannerInput {
  public static void main(String[] args) throws Exception {

    Scanner a = new Scanner(System.in);
    
    
    // 1. Write a Java program that takes two numbers as input and display the product of two numbers.
    /*
    Test Data:
      Input first number: 25
      Input second number: 5
    Expected Output:
      25 x 5 = 125
    */
    System.out.println("Enter first #");
    int aa = a.nextInt();
    System.out.println("First # is " + aa + "\nEnter second #");
    int aaa = a.nextInt();
    System.out.println("Second # is " + aaa + "\nProduct is " + (aa*aaa));




    // 2. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    /*
    Test Data:
      Input first number: 125
      Input second number: 24
    Expected Output :
      125 + 24 = 149
      125 - 24 = 101
      125 x 24 = 3000
      125 / 24 = 5
      125 mod 24 = 5
    */
    System.out.println("\n \n \n \n Enter third #");
    float aaaa = a.nextFloat();
    System.out.println("\nthird # is " + aaaa + "\nEnter second #");
    float aaaaa = a.nextFloat();
    System.out.println("\nfourth # is " + aaaaa + 
    "\n\n " +aaaa + " + " + aaaaa + " = " + (aaaa + aaaaa) + 
    "\n " +aaaa + " - " + aaaaa + " = " + (aaaa-aaaaa) + 
    "\n " +aaaa + " x " + aaaaa + " = " + (aaaa*aaaaa) + 
    "\n " +aaaa + " / " + aaaaa + " = " + (aaaa/aaaaa) + 
    "\n " +aaaa + " mod " + aaaaa + " = " + (aaaa%aaaaa));

    // 3. Write a Java program that takes a number as input and prints its multiplication table upto 10.
    /*
    Test Data:
      Input a number: 8
    Expected Output:
      8 x 1 = 8
      8 x 2 = 16
      8 x 3 = 24
      ...
      8 x 10 = 80
    */
    System.out.println("\n \n \n \nEnter fifth #");
    int aaaaaa = a.nextInt();
    System.out.println("Fifth # is " + aaaaaa + "\n");
    
    for(int aaaaaaa = 1; aaaaaaa <= 10; aaaaaaa++) {
      System.out.println(aaaaaa + " x " + aaaaaaa + " = " + (aaaaaa*aaaaaaa));
    }
    

    // 4. Write a Java program to display the following pattern.
    /*
      Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
    */


  }
}