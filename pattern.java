import java.util.*;

class pattern
{
	public static void main(String args[])
	{	System.out.println("Enter no. of lines of pattern");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j,k,l;
		for (l=0;l<n;l++)
		{
			for (k=n;k>l;k--)
			{System.out.print(" ");
			}
		
			for (j=0;j<=l;j++)
			{System.out.print("j ");
			}
			System.out.print("\n");
		}
		
	}
	


}
