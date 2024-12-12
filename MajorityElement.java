import java.util.Scanner;
class MajorityElement
{
	public static void main(String[] args) 
	{
		int i,n,majority=-1,count=0;
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
		for(i=0;i<n;i++)
		{
			if(count==0)
			{
				majority=a[i];
				count=1;
			}
			else if(a[i]==majority)
			{count++;
			}
			else
			{
				count--;
			}
		}

	count=0;
		for(i=0;i<n;i++)
		{
			if(a[i]==majority)
			{
				count++;
		}
	}

	if(count>n/2)
	{
		System.out.println("majority element: "+majority);
	}
	else
	{
		System.out.println("majority element : -1");
	}
}
}







