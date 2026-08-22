//Find Sum of all elements in an array
import java.util.Scanner;
class SumOfArray{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int[] arr=new int[5];

//Take Input
System.out.println("Enter 5 Integer Numbers:");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
int Sum=0;
//Print
for(int num:arr){ 
Sum+=num;
}
System.out.println("Sum of Elements if array"+ Sum);
}
}



/*Output:
Enter 5 Integer Numbers:
4
6
8
2
10
Sum of Elements if array30*/