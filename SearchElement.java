import java.util.Scanner;
class SearchElement
{
	public static void main(String[] args) 
	{
		int i,n,search,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		n=sc.nextInt();
		int[] a=new int[n];
	    System.out.println("enter the elements in the arrray");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
		{
	System.out.println("the array elemnts are:\n"+a[i]);
		}
		System.out.println("enter the search element");
		search=sc.nextInt();
	for(i=0;i<n;i++)
		{
		if(a[i]==search)
			{
			System.out.println("element found at position"+(i+1));
		c=1;
		}
		}
		if(c==0)
		{
			System.out.println("element not found");
		}
	}
}
	
		
		



