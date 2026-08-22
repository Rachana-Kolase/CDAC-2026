//Print all inputs of an Array

import java.util.Scanner;
class PrintArray{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int[] arr=new int[5];

//Take Input
System.out.println("Enter 5 Integer Numbers:");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
//Print
for(int num:arr){ 
System.out.println(num +" ");
}
}
}


/*Output:Enter 5 Integer Numbers:
3
7
5
12
8
3
7
5
12
8*/