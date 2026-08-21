//Program for User input for Positive Numbers

import java.util.Scanner;
class PositiveNumbers{
Scanner sc=new Scanner(System.in);

   int askForPositiveNo(int num){
    Do{
     System.out.println("Please Enter a positive number:");
num=sc.nextInt();

     }while(num<=0);
return num;
}
   
  public static void main(String[]args){

PositiveNumbers obj=new PositiveNumbers();
int result=obj.askForPositiveNo(0);
System.out.println("Positive No:" +result);

}
}