import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number X & Y :");


    int num1 = myObj.nextInt();  // Read user input
    int num2 = myObj.nextInt();
    
    int prod1 = 0;
    for (int counter = 1; counter <= num2; counter++)
    {
        prod1 += num1;
    }
    System.out.println(prod1);
  }
}