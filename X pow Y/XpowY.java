import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number X power of Y :");


    int numx = myObj.nextInt();  // Read user input
    int numy = myObj.nextInt();
    System.out.println(Math.pow(numx, numy));  // Output user input
  }
}