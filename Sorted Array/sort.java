import java.util.Scanner;  // Import the Scanner class
import java.util.Arrays;
import java.util.Collections;

class  calculate
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the number of array :");
    int inputuser = myObj.nextInt();

    Integer[] myarray = new Integer[inputuser];

    for (int i = 0;i < inputuser; i++) 
    {
      myarray[i] = myObj.nextInt();
    }
    // int[] arr = new int[inputuser];
    // for (int i = 0; i < inputuser; i++)
    // {
    //   arr[i] == myarray[i];
    // }
    System.out.println("\n\n");

    System.out.println("sort array Ascending :");
    Arrays.sort(myarray);
    System.out.println(Arrays.toString(myarray));

    System.out.println("sort array Ascending :");
    Arrays.sort(myarray, Collections.reverseOrder());
    System.out.println(Arrays.toString(myarray));

  }
}