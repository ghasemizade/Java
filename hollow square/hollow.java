import java.util.Scanner;  // Import the Scanner class

class  calculate
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the number :");
    int side = myObj.nextInt();
    System.out.println("Enter the char for draw square :");
    char symbol = myObj.next().charAt(0);

    for (int i = 0; i < side; i++)
    {
      System.out.print(symbol);
    }

    System.out.println();

    for (int i = 0; i < side - 2; i++)
    {
      System.out.println(symbol);
      for (int j = 0; j < side - 2; j++)
      {
        System.out.print("");
      }
      System.out.println(symbol);
    }
    for (int i = 0; i < side; i++) 
    {
      System.out.print(symbol);
    }
    System.out.println();
  }
}