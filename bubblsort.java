import java.util.*;
class bubblsort
{public static void main(String ar[])
{
 int a[]=new int[100];
 Scanner s=new Scanner(System.in);
 System.out.println("enter number of elements");
 int n=s.nextInt();
for(int i=0;i<n;i++)
{a[i]=s.nextInt();}
 for(int i=0;i<n;i++)
{
 for(int j=i;j<n-1;j++)
{
 if(a[j]>a[j+1])
{
 a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
}
}
}
 for(int i=0;i<n;i++)
{System.out.println(a[i]);}
}
}                                         