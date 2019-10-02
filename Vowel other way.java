/*Wap to print user entered character is vowel or consonant*/
import java.util.Scanner;
class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a character: ");
		char ch=sc.next().charAt(0);
		if (ch>='A' && ch<='Z') {
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				System.out.println("VOWEL Character");
			}
			else {
				System.out.println("Consonant Character");	
			}
		}
		
		else if (ch>='a' && ch<='z') {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("VOWEL Character");
			}
			else {
				System.out.println("Consonant Character");	
			}			
		}
		
		else {
			System.out.println("INVALID Character!!!");
		}
		

	}
	
}