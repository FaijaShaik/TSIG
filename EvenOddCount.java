import java.util.Scanner;
class EvenOddCount
{
	public static void main(String[] args) 
	{
		int rem,n,evencount=0,oddcount=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number n");
		n=sc.nextInt();
		while(n!=0){
	rem=n%10;
	if(rem%2==0)
		evencount++;
	else
		oddcount++;
	n=n/10;
		}
	System.out.println("evencount: "+evencount+"\noddcount:  "+oddcount);
	}
	
}
