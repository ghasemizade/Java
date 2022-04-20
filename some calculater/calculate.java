import java.util.Scanner;  // Import the Scanner class

class  calculate
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the number :");

    int sum = 1;

    int inputuser = myObj.nextInt();
    int[] MyArray;
    MyArray = new int[inputuser];
    int counter = 0;
    int count = 0;
    System.out.println("entered :");

    while(counter < inputuser)
    {
      MyArray[counter] = myObj.nextInt();
      sum += MyArray[counter];
      count++;
      counter++;
    }
    System.out.println("number of input user :");
    System.out.println(count);

    int min = MyArray[0];
    int max = MyArray[0];

    for (int i = 0; i < inputuser; i++)
    {
      if (MyArray[i] < min)
      {
        min = MyArray[i];
      }
      if (MyArray[i] > max)
      {
        max = MyArray[i];
      }
    }
    System.out.println("minimum number in this array :");
    System.out.println(min);
    System.out.println("maximum number in this array :");
    System.out.println(max);

    float avg;

    avg = sum / count;
    System.out.println("avrage of numbers :");
    System.out.println(avg);

    float submission, power, division;
    int variance = 0;

    for (int i = 1; i < inputuser; i++)
    {
      submission = MyArray[i] - avg;
      power = (submission * submission);
      division = power / count;
      variance += division;
    }
    System.out.println("variance :");
    System.out.println(variance);
  }
}