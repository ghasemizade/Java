import java.util.Scanner;  // Import the Scanner class

class  avg{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number X & Y :");

    int avg[];
    avg = new int [4];
   
    float temp = 0;
    float average = 0;

    for (int counter = 0; counter < 4; counter++)
    {
        avg[counter] = myObj.nextInt();
        temp += avg[counter];
    }
    average = temp / 4;
    System.out.println(average);
  }
}