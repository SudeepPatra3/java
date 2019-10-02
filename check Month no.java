import java.util.Scanner;
class Month
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no");
		int i = s.nextInt();
		if (i>=12)
			System.out.println("not a month no");
		else
			System.out.println("month no");
	}
}

	
			
			