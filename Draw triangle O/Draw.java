import java.util.Scanner;  // Import the Scanner class

class  Draw{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number :");

    int input = myObj.nextInt();
    //int sum = 1;
    for (int counter = input; counter >= 1; --counter)
    {
      //System.out.println(" ** ");
      for (int counter1 = 1; counter1 < counter; counter1++) 
      {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }
}