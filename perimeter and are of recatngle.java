import java.util.Scanner;
class Rect
{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("enter  height ");
	double l=s.nextDouble();
	System.out.println("enter width ");
	double w=s.nextDouble();
	double area,perimeter;
	area=l*w;
		System.out.println("area is--" +area);
	perimeter=2*(l+w);
	System.out.println("perimeter is--" +perimeter);
	}
}
