import java.util.*;
class LargestFive 
{
static Scanner s=new Scanner(System.in);
public static void main(String[] args) 
{
System.out.println("We are going to find 3rd Largest among five number");
System.out.print("a:");
int a=s.nextInt();
System.out.print("b:");
int b=s.nextInt();
System.out.print("c:");
int c=s.nextInt();
System.out.print("d:");
int d=s.nextInt();
System.out.print("e:");
int e=s.nextInt();
if(a>b && a>c && a>d && a>e)//a 1st large
{
if(b>c && b>d && b>e)//b 2nd large
{
if(c>d && c>e)//c 3rd large
{
System.out.println(c+ " is the 3rd Largest");
}
else if(d>e)
{
System.out.println(d+ " is the 3rd Largest");
}
else
{
System.out.println(e+ " is the 3rd Largest");
}
}
}
else if(b>c && b>d && b>e)
{
if(c>a && c>d && c>e)
{
if(d>a && d>e)
{
System.out.println(d+ " is the 3rd Largest");
}
else if(a>e)
{
System.out.println(a+ " is the 3rd Largest");
}
else
{
System.out.println(e+ " is the 3rd Largest");
}
}
}
else if(c>d && c>e)
{
if(d>a && d>b && d>e)
{
if(e>a && e>b)
{
System.out.println(e+ " is the 3rd Largest");
}
else if(a>b)
{
System.out.println(a+ " is the 3rd Largest");
}
else
{
System.out.println(b+ " is the 3rd Largest");
}
}
}
else if(d>e)
{
if(e>a && e>b && e>c)
{
if(c>a && c>b)
{
System.out.println(c+ " is the 3rd Largest");
}
else if(a>b)
{
System.out.println(a+ " is the 3rd Largest");
}
else
{
System.out.println(b+ " is the 3rd Largest");
}
}
}
else
{
if(a>b && a>c && a>d)
{
if(b>c && b>d)
{
System.out.println(b+ " is the 3rd Largest");
}
else if(c>d)
{
System.out.println(c+ " is the 3rd Largest");
}
else
{
System.out.println(d+ " is the 3rd Largest");
}
}
}
}
}