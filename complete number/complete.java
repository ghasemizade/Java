import java.util.Scanner;  // Import the Scanner class

class  complete{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number :");

    int input = myObj.nextInt();
    int sum = 1;

    for (int i = 0; i < input; i++)
    {
      if (input % i == 0)
      {
        sum += i;
      }
    }
    if (sum == input)
    {
      System.out.println("this number is tom :)");
    }
    else 
    {
      System.out.println("this not tom number !");
    }
  }
}