//Program for Age Checker

import java.util.Scanner;

class Age{
  String AgeCategory(int i){  
  String stage=(i<=12) ? "Child" : (i<=19) ? "Teenager" : (i<=40) ? "Adult" : (i<=60) ? "Middle-Age Adult" : "Fail";     
  return stage;
}

public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 
System.out.println("Enter age:");
int i=sc.nextInt();

  
Age obj=new Age();
String stage=obj.AgeCategory(i);
System.out.println("Your are an:"+ stage);
}
}



/*Enter age:
30
Your are an:Adult*/