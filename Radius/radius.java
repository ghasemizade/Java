import java.util.Scanner;

class radius {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter radius of circle :");

    float pi = 3.14f;

    float radius = myObj.nextFloat();  // Read user input
    //System.out.println("age is: " + age);  // Output user input
    float enviroment = 2 * pi * radius;
    float diameter = 2 * radius;
    float area = pi * radius * radius;


    System.out.println("enviroment: " + enviroment);
    System.out.println("diameter: " + diameter);
    System.out.println("area: " + area);

  }
}