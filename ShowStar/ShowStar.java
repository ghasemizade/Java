import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number :");


    int star = myObj.nextInt();  // Read user input
    //int num2 = myObj.nextInt();
    
    for (int counter = 1; counter <= star; counter++)
    {
        System.out.println("*");
    }
  }
}