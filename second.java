import java.io.*;
import java.util.*;
class second
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int n,count=0;
n=ob.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ob.nextInt();
}
Arrays.sort(a);
System.out.println(a[1]);
}
}
