import java.util.Scanner;  // Import the Scanner class

class  calculate
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the number :");
    int inputuser = myObj.nextInt();

    int sum = 0;
    int temp = inputuser / 2;
    int newtemp = 0;

    for (int i = 2; i <= temp; i++)
    {
      if (inputuser % i == 0)
      {
        System.out.println("No");
        newtemp = 1;
        break;
      }
    }
    if (newtemp == 0)
    {
      System.out.println("Yes");
    }
  }
}