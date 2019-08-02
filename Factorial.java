import java.util.Scanner;
class Factorial{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
for(int i=1,fact=1;i<=N;i++)
   {
    fact=fact*i;
    System.out.println(fact);
    }
}
}