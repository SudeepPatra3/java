import java.util.Scanner;
class Shop
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("price of the product");
		int p=s.nextInt();
		
		System.out.println("total money");
		int total=s.nextInt();
		
		double change=total%p;
		System.out.println("change is "+change);
	}
}

		