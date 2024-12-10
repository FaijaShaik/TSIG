import java.util.Scanner;
class MaxMinOfArray 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);  
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter array elements:");
	int i;
	for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int min=a[1], max=a[1];
		for(i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("minimum element is :" +min);
		System.out.println("maximum element is :" +max);
	}
}
		