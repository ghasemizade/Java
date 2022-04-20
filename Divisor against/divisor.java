import java.util.Scanner;  // Import the Scanner class

class  divisor{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number :");

    int input = myObj.nextInt();
    //int sum = 1;
    System.out.println("divisor of input number :");

    for (int i = 1; i <= input; i++)
    {
      if (input % i == 0)
      {
        System.out.println(i);
      }
    }
  }
}