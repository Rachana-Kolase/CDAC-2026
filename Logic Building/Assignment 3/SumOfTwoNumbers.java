import java.util.Scanner;
class SumOfTwoNumbers{

int SumOfTwoNumbers(int a,int b){
    
    int result;
    int result=a+b;
    return result;
 }

public static void main(String[]args){ 
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter first no:");
 int a=sc.nextInt();

 System.out.println("Enter second no:");
 int b=sc.nextInt();

 SumOfTwoNumbers obj=new SumofTwoNumbers();
 int result=obj.SumofTwoNumbers(a,b);
 System.out.println("Sum Of Two Numbers  :"+ result);
 }
}




