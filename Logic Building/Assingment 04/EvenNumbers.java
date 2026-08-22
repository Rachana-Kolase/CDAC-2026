//Print Even Numbers from 1 to N

import java.util.Scanner;
class EvenNumbers{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter Number");
int n=sc.nextInt();


for (int i=1;i<=n;i+=2){
if(i%2==0){

System.out.println(i+ " ");
}
}
}
}



/*Output:
Enter Number10
2
4
6
8
10*/