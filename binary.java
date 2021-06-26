import java.util.*;
class binary
{
	public static void main(String ar[])
	{
		int beg, end, mid, t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int l=sc.nextInt();
		int a[]=new int[l];
		System.out.println("Enter array elements");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		beg=0;
		end=l-1;
		System.out.println("Enter search element");
		int c=sc.nextInt();
		while(beg<=end)
		{
			mid=(beg+end)/2;
			if(a[mid]==c)
			{
				System.out.println("Element found at "+mid);
				t++;
				break;
			}
			if(a[mid]>c)
			{
				end=mid-1;
			}
			else if(a[mid]<c)
			{
				beg=mid+1;
			}
		}	
		if((beg>end)&&(t==0))
		{
			System.out.println("Element not found");
		}
	}
}