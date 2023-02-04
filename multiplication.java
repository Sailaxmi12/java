import java.util.Scanner
 class Multiplication
{
  public static void main(String args[])
   {
  Scanner Sc=new Scanner(System.in);
   int n,k,t;
  n=Sc.nextInt();
  k=Sc.nextInt();
t=Sc.nextInt();
  for(int i=1;i<=t;i++)
  {
  System.out.print(n+"x"+i+"="+(n*i));
  System.out.print("\t|\t");
   System.out.print((n+1)+"x "+i+"="+((n+1)*i));
   System.out.print("\t|\t");
   System.out.print(n+2)+" x "+i+"="+((n+2)*i));
   System.out.println();
  for(int j=0;j<k;j++)
{
  System.out.print((n+j)+" x "+i+"="((n+j)*i));
   System.out.print("\t|\t");
   }
   System.out.println();
}
}
}