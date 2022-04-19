import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number to power of the 1 , 2 , 3 :");


    int num = myObj.nextInt();  // Read user input
    System.out.println(num);  // Output user input
    System.out.println(num * num);
    System.out.println(num * num * num);
  }
}