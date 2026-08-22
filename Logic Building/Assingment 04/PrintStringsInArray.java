//Print all Strings in Array

import java.util.Scanner;
class PrintStringsInArray{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
String[] arr=new String[4];

//Take Input
System.out.println("Enter 4 Names:");
for(int i=0;i<4;i++){
arr[i]=sc.nextLine();
}

//Print
for(String N:arr){
System.out.println(N +" ");
}
}
}




/*Output:
Enter 4 Names:
Manoj
Aditya
Shilbhushan
Shweta


Manoj
Aditya
Shilbhushan
Shweta*/