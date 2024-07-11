import java.util.*;
class Largestofthree
{
/*public static void main(String args[])
{
 a=12,b=24,c=36,largest;
int a=24,b=36,c=12,largest;
int a=36,b=12,c=24,largest;
largest=((a>b)&&(a>c))?a:((b>c)?b:c);
System.out.println("largest of three numbers is:"+largest);
}*/
	public static void main(String args[])
	{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	System.out.println("Enter the value of b:");
	System.out.println("Enter the value of c:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();

	if(a>b)
	{
		if(a>c)
		{
		System.out.println("a is largest");
		}
		else
		{
		System.out.println("c is largest");
		}
	}
	else
	{
		if(b>c)
		{
		System.out.println("b is largest");
		}
		else
		{
		System.out.println("c is largest");
		}
	}


	}

}