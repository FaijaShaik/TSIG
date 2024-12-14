import java.util.Scanner;
class EvenSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array n");
		int n=sc.nextInt();
			int[] a=new int[n];
			System.out.println("enter array elements");
			int i,sum=0;
		for(i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
			System.out.println("The array elements are:");
		for(i=0;i<n;i++){
		System.out.println(a[i]);
		if(a[i]%2==0)
		{
			sum=sum+a[i];

	}
		}
	System.out.println("The sum of even numbers in an array is"+sum);

}
}
