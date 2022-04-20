import java.util.Scanner;  // Import the Scanner class

class  calculate
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the number :");
    int inputuser = myObj.nextInt();

    System.out.println("Enter the symbol :");
    char symbol = myObj.next().charAt(0);

    int modnum;
    int inputrevers = 0;

    for (int i = inputuser; 0 < inputuser; i++)
    {
      modnum = inputuser % 10;
      inputrevers = inputrevers * 10 + modnum;
      inputuser /= 10;
    }
    for (int i = inputrevers; 0 < inputrevers; i++)
    {
      modnum = inputrevers % 10;
      inputrevers /= 10;
      System.out.print(inputrevers);
      System.out.print(symbol);
    }
  }
}