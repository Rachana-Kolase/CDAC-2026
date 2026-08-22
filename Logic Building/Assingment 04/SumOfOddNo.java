//Print Sum of Odd numbers between 1 and N

import java.util.Scanner;
class SumOfOddNo{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter Number:");
int n=sc.nextInt();

int Sum=0;
for(int i=1;i<=n;i+=2){
Sum += i;
}
System.out.println("Sum of Odd Numbers from 1 to" +  n + " is:" + Sum);
}
}





/*Output:
Enter Number:
10
Sum of Odd Numbers from 1 to10 is:25*/