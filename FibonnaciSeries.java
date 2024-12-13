import java.util.Scanner;
class FibonnaciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms");
		int n=sc.nextInt();
		int first=0,second=1;
		System.out.println("Fibonacci series:");
		
        System.out.println("Fibonacci Series Upto " + n + ": ");
    
    while (first <= n) {
      System.out.print(first+ ", ");

      int next = first+ second;
      first = second;
      second = next;

    }
  }
}
		




