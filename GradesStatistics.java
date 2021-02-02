import java.util.Scanner;
public class GradesStatistics
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num1 = sc.nextInt();
		System.out.println("Enter an integer");
		int num2 = sc.nextInt();	
		System.out.println("Enter an integer");
		int num3 = sc.nextInt();
		 double ave = average(num1,num2,num3);
		 double maxx = max(num1,num2,num3);
		 double minn = min(num1,num2,num3);
		 String word = words(num1,num2,num3);
		 System.out.println("The average is " + ave );
		 System.out.println("The max is " + maxx );
		 System.out.println("The min is " + minn );
		 System.out.println("You " + word );
	
	}
	public static double average(int x, int y, int z)
	{
		double total = x+y+z;
		
		total = total/3;
		return total;
	}
	public static int max(int x, int y, int z)
	{
		if (x<y && y>z)
		return y;
		else if (y<x && x>z )
		return x;
		else 
		return z;
	}
	public static int min(int x, int y, int z)
	{
		if (x<y && y<z)
		return y;
		else if (y<x && x<z )
		return x;
		else 
		return z;
	}
	public static String words(int x, int y, int z)
	{
			double total = x+y+z;
		
		total = total/3;
		if (total<65)
		return "failed";
		else 
		return "passes";
	}
}