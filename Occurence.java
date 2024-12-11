import java.util.Scanner;
class Occurence
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] a=new int [n];
		System.out.println("enter the array elements");
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
			System.out.println("the array elements are:"+a[i]);
		System.out.println("Enter the number to search");
		int search=sc.nextInt();
		int c=0;
		for(i=0;i<n;i++)

		{
			if(a[i]==search)
				c++;
		}
		System.out.println("The number "+search+" occurs "+c+" times");
	

	}
}
