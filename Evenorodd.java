import java.util.*;
class Evenorodd
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;

		System.out.println("Enter the value of a:");

		a=sc.nextInt();
	if(a%2==0)
		System.out.println(a+" "+"is even number");
	else 
		System.out.println(a+" "+"is odd number");

	}
}