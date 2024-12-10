import java.util.Scanner;
class Factorialnum{
	public static void main(String[] args) 
	{
		int n,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	while(n!=0)
		{
		fact=fact*n;
		n--;
		}
	System.out.println("the factorial of a number is :\n"+fact);
	}
}
