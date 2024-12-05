import java.util.*;
class f
{
public static void main(String args[])
{
 Scanner Sc=new Scanner(System.in);
 int t=Sc.nextInt();
 for(int j=0;j<t;j++)
 {
 int n=Sc.nextInt();
int c=0;
for(int i=1;i<=n;i++)
{
 if(n%i==0)
{
 c+=1;
 }
 System.out.println(c);

 }
}
}
}