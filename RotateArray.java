import java.util.Scanner;
class RotateArray 
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
		           }
				   System.out.println("enter the K value to rotate");
				   int k=sc.nextInt();
                k = k % a.length;
        for (i = 0; i < k; i++) {
            int last = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
        for ( i= 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
  
