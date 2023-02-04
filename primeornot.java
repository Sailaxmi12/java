import java.util.Scanner
class primeornot
{
 public static boolean isprime(int n)
 {
 int count=0;
    for(int i=2;i<=(int)Math.sqrt(n);i++)
{
if(n%==0)
count++;
}
if(count==0)
retrun true;
else
return flase;
}
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n;
n=Sc.nextInt();
if(isprime(n))
  System.out.println("true");
  else
 System.out.println("flase");
}}

  