import java .util.*;
class e
{
public static void main(String args[])
 {
    Scanner Sc=new Scanner(System.in);
    int t=Sc.nextInt();
    for(int i=0;i<16;i++)
    {
     int n=Sc.nextInt();
    for(int j=1;j<=n;j++)
    {
     if(n%j==0)
     System.out.print(j+" ");
    }
    System.out.println();
    }
 }
}

        
    

    

