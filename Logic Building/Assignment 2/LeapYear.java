//Lead Year

class LeapYear{
public static void main(String[]args){
int year=2024;

if((year%4==0)&&(year%100!=0)||(year%400==0)){
System.out.println(year +"Leap Year");
}
else{
System.out.println(year +"Not Leap Year");
}
}
}


//Output:Year 2024 Leap Year

