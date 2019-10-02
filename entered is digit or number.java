import java.util.Scanner;
class Check
{
	public static void main (String[] args)
	{
	Scanner s = new Scanner(System.in);
System.out.println("enter something");
int i=s.nextInt();
 
if (i>=-9&&i<=9)//digit means from -9 to 9 others are number
	System.out.println("its a digit");
else
	System.out.println("not a digit");
	}
}

	
	