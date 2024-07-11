import java.util.*;
class Ratio
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	float a,b,ratio,temp;
	System.out.println("Enter the value of a:");
	System.out.println("Enter the value of b:");
	a=sc.nextFloat();
	b=sc.nextFloat();
	ratio=a/b;
	if(ratio>0)
	{
	temp=a;
	a=b;
	b=temp;
	System.out.println("Value of a:"+a);
	System.out.println("Value of b:"+b);
	}
        }
}