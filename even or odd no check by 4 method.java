import java.util.Scanner;
class No
{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter the no");
int i=s.nextInt();

	
if (i/2*2 == i) // 6/2=3...3*2=6,,,,,6=6 so even or 5/2=2...2*2=4,,,5!=4 so odd
	System.out.println("no is even");
else
	System.out.println("no is odd");


}
}

//by using String
class No2
{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter the no");
int i=s.nextInt();
String st[]={"even","odd"};
System.out.println(i+ "is"+st[i%2]);
}
}


//by using bitwise operator
class No3
{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("enter the no");
int i=s.nextInt();

	
if ((i&1) == 0) 
	System.out.println("no is even");
else
	System.out.println("no is odd");


}
}
	
	
	
