import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) 
	{
	int n,rem,Sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number n");
	n=sc.nextInt();
	while(n>0)
		{
		rem=n%10;
		Sum=Sum+rem;
		n=n/10;
		}
		System.out.println("The sum of the integer is"+Sum);
	}
}
