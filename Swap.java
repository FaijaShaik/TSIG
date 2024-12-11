import java.util.Scanner;
class Swap
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number a");
		a=sc.nextInt();
		System.out.println("Enter a number b");
		b=sc.nextInt();
		System.out.println("Before swapping a and b are"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the numbers are"+a+" "+b);
	}
}
