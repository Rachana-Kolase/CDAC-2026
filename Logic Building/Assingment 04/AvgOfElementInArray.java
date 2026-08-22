//Print Average of elements in Array

import java.util.Scanner;

class AvgOfElementInArray{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int[] arr=new int[5];

//Take Input
System.out.println("Enter 5 Numbers:");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}

int Sum=0;
for(int num:arr){
Sum+=num;
}
double avg=(double) Sum/5;

System.out.println("The Average of the numbers is:"+ avg);
}
}


/*Output:
Enter 5 Numbers:
10
20
30
40
50
The Average of the numbers is:30.0*/