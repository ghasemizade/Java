import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number X & Y :");


    int num1 = myObj.nextInt();  // Read user input
    int num2 = myObj.nextInt();
    
    int div1 = 0;
    int mod = num1;
    for (int counter = 0;;counter++)
    {
        if (mod >= num2)
        {
            div1++;
            mod -= num2;
        }
        else
        {
            break;
        }
    }    
    System.out.println(div1);
  }
}