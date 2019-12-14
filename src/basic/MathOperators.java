package basic;

public class MathOperators {

  public static double x = 3;
  public static double y = 4;

  public static void main(String[] args) throws Exception {
    // 1. Write a Java program to print the sum of two numbers.
    /*
    Test Data:
      74 + 36
    Expected Output :
      110
    */
    double z = x + y;
    System.out.println("Sum: " + z);

    // 2. Write a Java program to divide two numbers and print on the screen.
    /*
    Test Data :
      50/3
    Expected Output :
      16
    */
    double a = x/y;
    System.out.println("After Division: " + a);

    // 3. Write a Java program to print the result of the following operations.

    /*
    Test Data:
      a. -5 + 8 * 6
      b. (55+9) % 9
      c. 20 + -3*5 / 8
      d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output:
      43
      1
      19
      13
    */
    double b = -2+5*3;
    //expected: 13
    double c = (33+4) % 2;
    //expected: 1
    double d = 15 + -6*-2 / 2;
    //expected: 27
    double e = 6 + 5 / 3 * 6 - 8 % 2;
    //expected: 12
    System.out.println("a. " + b);
    System.out.println("b. " + c);
    System.out.println("c. " + d);
    System.out.println("d. " + e);
  }
}