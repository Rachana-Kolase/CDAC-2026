//Print Largest Element in Array

import java.util.Scanner;
import java.util.Arrays;

class PrintLargestElementInArray{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int[] arr=new int[5];

//Take Input
System.out.println("Enter 5 Numbers:");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
Arrays.sort(arr);

//Largest no is at last index;
System.out.println("Largest element is:"+ arr[4]);
}
}





/*Output:
Enter 5 Numbers:
12
45
67
23
89
Largest element is:89*/