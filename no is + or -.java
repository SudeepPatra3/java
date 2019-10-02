import java.util.Scanner;
class Checking
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int i=s.nextInt();
		
		if (i>0)
			System.out.println("no is positive");
		else if (i==0)
			System.out.println("no is zero");
		else
			System.out.println("no is negetive");
	}
}

			