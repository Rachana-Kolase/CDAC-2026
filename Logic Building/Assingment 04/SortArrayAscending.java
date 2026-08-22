//Sort Array in Ascendin order

import java.util.Scanner;
import java.util.Arrays;

class SortArrayAscending{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int[] arr=new int[5];

//Take Input
System.out.println("Enter 5 Numbers:");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
Arrays.sort(arr);

for(int num:arr){
System.out.println(num +" ");
}
}
}





/*Output:
Enter 5 Numbers:
12
45
23
8
90
8
12
23
45
90*/