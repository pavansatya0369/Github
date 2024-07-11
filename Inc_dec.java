class Inc_dec
{
//int i=19,j=29,k;
int a=12,b=13,c=11;
void incDec()
{
/*k=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
System.out.println("value of i is:"+i);
System.out.println("value of j is:"+j);
System.out.println("value of k is:"+k);*/
a=a++ + --b + c++;
b=b++ + ++a * 2;
c=c++ + a++ *(++b);
System.out.println("value of a is:"+a);
System.out.println("value of b is:"+b);
System.out.println("value of c is:"+c);
}
public static void main(String args[])
{
Inc_dec obj=new Inc_dec();
obj.incDec();
}
}