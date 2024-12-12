import java.util.Scanner;
class FloorElement
{
	public static void main(String[] args) 
	{
		int i,k,n;
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
		System.out.println("enter the value of k");
		k=sc.nextInt();
		int result=-1;
		for(i=n-1;i>=0;i--)
		{
			if(a[i]<=k)
			{
				result=i;
					break;
			}
		}
		System.out.println("the floor of" + k + " is at index: "+ result);
	}
}

