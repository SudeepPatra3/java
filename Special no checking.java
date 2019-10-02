import java.util.Scanner;
class Special
{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("enter two digit no ");
	int x=s.nextInt();
	int d1 = x/10;
	int d2 = x%10;
	int sum = d1+d2 +(d1*d2);
	if (sum==x)
		System.out.println("no is a special ");
	else
		System.out.println("no is not a special no");
	}
	
}

		
	