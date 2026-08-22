//Multiple of 3 from 1 to N.

import java.util.Scanner;
class Multiple{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number:");
int n=sc.nextInt();

for (int i=3;i<=n;i+=3){
System.out.println(i+"");
}
}
}





/*Output:
Enter Number:
20
3
6
9
12
15
18*/