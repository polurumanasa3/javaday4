import java.util.*;
class j
{
public static void main(String args[])
{
 Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int c=0;
for(int i=1;i*i<=n;i++)
{
if(n%i==0)
 {
 c+=1;
if(i*i!=n)
{
 c+=1;
 }
 }
}
System.out.println(c);
}

}