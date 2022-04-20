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
      counter++;
    }
    int i , firstmax, secondmax, thirdmax;
    int firstmin = Integer.MAX_VALUE;
    int secondmin = Integer.MAX_VALUE;
    int thirdmin = Integer.MAX_VALUE;

    if (MyArray.length < 3)
    {
      System.out.println("Invalid Input");
    }
    thirdmax = firstmax = secondmax = 0;

    for (i = 0; i < MyArray.length; i++)
    {
      if (MyArray[i] > firstmax)
      {
        thirdmax = secondmax;
        secondmax = firstmax;
        firstmax = MyArray[i];
      }
      else if (MyArray[i] > secondmax)
      {
        thirdmax = secondmax;
        secondmax = MyArray[i];
      }
      else if (MyArray[i] > thirdmax)
      {
        thirdmax = MyArray[i];
      }
      if (MyArray[i] < firstmin)
      {
        thirdmin = secondmin;
        secondmin = firstmin;
        firstmin = MyArray[i];
      }
      else if (MyArray[i] < secondmin)
      {
      thirdmin = secondmin;
      secondmin = MyArray[i];
      }
      else if (MyArray[i] < thirdmin)
      {
        thirdmin = MyArray[i];
      }
    }
    System.out.println("three largest elements are :" + firstmax +","+ secondmax +","+ thirdmax);
    System.out.println("three smallest elements are :" + firstmin +","+ secondmin +","+ thirdmin);
  }
}