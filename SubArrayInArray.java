import java.util.*;

class SubArrayInArray
{
	int checkSubArray(int a[],int b[])
	{
		int i=0,j=0;
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					break;
				}
			}
		}
		if(j==a.length)
			return 0;
		else
			return 1;
	}
	public static void main(String args[])
	{
		SubArrayInArray s=new SubArrayInArray();
		int a[]={4,7,25,72,17};
		int b[]={4,72,18};
		int result=s.checkSubArray(a,b);
		
		if(result==1)
		{
			System.out.println("Yes");
		}
		else if(result==0)
			System.out.println("No");
	}
}
