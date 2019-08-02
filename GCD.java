import java.util.Scanner;
class GCD{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n1=scan.nextInt();
int n2=scan.nextInt();
int i=1,GCD=1;
while(i<=n1 && i<=n2)
{
  if(n1%i==0 && n2%i==0)
  {
   GCD=i;
  }
       
i=i+1;
}
System.out.println(GCD);
}
}