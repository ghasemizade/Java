import java.util.Scanner;  // Import the Scanner class

class bastpi {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number :");


    int number = myObj.nextInt();  // Read user input
    //int num2 = myObj.nextInt();
    
   	float pi = 3.14f;
   	float cirumference = 2 * pi * number;

   	System.out.println(cirumference / number);
  }
}