//Program to add two numbers 


import java.util.Scanner;
class Addition{

 int SumOfTwoNumbers(int a,int b){
    
    int result;
    result=a+b;
    return result;
 }

public static void main(String[]args){ 
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter first no:");
 int a=sc.nextInt();

 System.out.println("Enter second no:");
 int b=sc.nextInt();

 Addition obj=new Addition();
 int result= obj.SumOfTwoNumbers(a,b);
 System.out.println("Sum Of Two Numbers:"+ result);
 }
}






/*Enter first no:15
  Enter second no:25
  Sum Of Two Numbers:45*/

