import java.util.Scanner;
class Academic
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		String n = s.next();
		
		System.out.println("enter 10th percentage");
		double p = s.nextDouble();
		
		System.out.println("enter 12th percentage");
		double a = s.nextDouble();
		
		System.out.println("enter btech percent");
		double b = s.nextDouble();
		
		System.out.println("enter your btech clg name");
		String c = s.next();
		System.out.println(n+" " +p+" "+a+" "+b+" "+c);
		
		
	}
}

		