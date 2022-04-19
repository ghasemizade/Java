import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number X & Y :");


    int num1 = myObj.nextInt();  // Read user input
    int num2 = myObj.nextInt();
    
    int sum1 = 1;
    int sum2 = 1;
    
    if (num1 > num2)
    {
        for (int counter = num2; counter < num1; counter++)
        {
            if (counter % 2 == 1)
            {
                sum1 *= counter;
            }
        }
        System.out.println(sum1);
    }
    if (num1 < num2)
    {
        for (int counter = num1; counter < num2; counter++)
        {
            if (counter % 2 == 1)
            {
                sum2 *= counter;
            }
        }
        System.out.println(sum2);
    }
  }
}