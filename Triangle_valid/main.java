import java.util.Scanner;

class main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the three side of triangle :");

    

    int sideA = myObj.nextInt();
    int sideB = myObj.nextInt();
    int sideC = myObj.nextInt();
    

    //System.out.println("area: " + area);
    if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) 
    {
      System.out.println("this numbers create triangle :)");
    }
    else
    {
      System.out.println("this numbers does not create triangle !");
    }
  }
}