import java.util.Scanner;  // Import the Scanner class

class  palindrome
{
	public static void main(String[] args) 
	{
    	Scanner myObj = new Scanner(System.in);
    	System.out.println("Enter the number :");

    	int inputuser = myObj.nextInt();

    	int Tempnumber = inputuser;
    	int mod;
    	int revers = 0;

    	if (inputuser < 0)
    	{
    		System.out.println("false");
    	}
    	while (inputuser != 0)
    	{
    		mod = inputuser % 10;
    		revers = revers * 10 + mod;
    		inputuser /= 10;
    	}
    	if (Tempnumber == revers)
    	{
    		System.out.println("Yes");
    	}
    	else
    	{
    		System.out.println("No");
    	}
	}
}    