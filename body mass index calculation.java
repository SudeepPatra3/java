import java.util.Scanner;
class Bmi
{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("enter your height in feet");
	double h=s.nextDouble(); //5.11
	System.out.println("enter your weight in kg");
	double w=s.nextDouble();//60
	double b;
	
	int feet=(int)h; //take only 5 feet from 5.11 in integer
	int inch=(int)((h-feet)*100);  // take 0.11 inch from 5.11...5.11-5=0.11*100=11
	double meter = (feet*12+inch)*0.0254; // 5*12+11 inch
	System.out.println("meter h"+meter);
	
	b=w/(h*h);
	System.out.println("bmi is "+b);
	
	}
}
	
	
	