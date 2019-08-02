import java.util.Scanner;
class Count_oddNumber{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("enter the value of N:");
int N=scan.nextInt();
int i,count=0;
for(i=1;i<=N;i++){
   if(i%2!=0){
       count=count+1;
       }
   
}
System.out.println(count);
}
}