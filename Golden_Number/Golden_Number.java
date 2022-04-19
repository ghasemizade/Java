import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number :");


    int num1 = myObj.nextInt();  // Read user input
    //int num2 = myObj.nextInt();
    
    System.out.println(num1 / 1.618);
    System.out.println(num1 * 1.618);
    
    
  }
}