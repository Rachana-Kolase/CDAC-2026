//Grade Evaluation System

class GradeEvaluation{
public static void main(String[]args){

int Maths=80;
int Science=85;
int History=90;
int Avg;


Avg=(Maths+Science+History)/3;
System.out.println("Average Marks:"+ Avg);



if (Avg>=90){
System.out.println("Grade A");
}
else if(Avg>=70){
System.out.println("Grade B");
}
else if(Avg>=50){
System.out.println("Grade C");
}
else if(Avg>=30){
System.out.println("Grade D");
}
else{
System.out.println("Fail");
}
}
}




\*Output:
Average Marks:85
Grade B*\

