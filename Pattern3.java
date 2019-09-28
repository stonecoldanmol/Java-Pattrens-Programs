class Patt5
{
public static void main(String[] args)
{
int num=1;
for(int i=0;i<=4;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(num+" ");

num=num+1;

}
System.out.println();
}
}
}
//---------------------------------------------------------------------------------
class Patt6
{
public static void main(String[] args)
{
for(int i=0;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("*");
}
for(int l=1;l<=i;l++)
{
System.out.print("*");
}
System.out.println();
}
}
}
	