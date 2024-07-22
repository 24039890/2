import java.util.Scanner;

public class class_quiz{

    public static void main(String [] args){
    
     calfinal();
        
    
        
    }
    public static void calfinal(){

        Scanner marks =new Scanner(System.in);
        System.out.println(" enter the semester mark");
           double semester_mark = marks.nextDouble();

        System.out.println(" enter the exam mark");
          double exam_marks =marks.nextDouble();


        double final_mark=semester_mark*0.6 + exam_marks*0.4;
         System.out.print( "semester number = " + final_mark);
         student(final_mark);

    }
    
    public static double student(double final_mark ){

            if( final_mark >=75){
            System.out.println("   your pass with distiction");
            System.out.println(" outstanding levels");
        }
        else if( final_mark>=50 && final_mark< 75){
            System.out.println("  your pass");
            
        }
        else if( final_mark >=49 && final_mark<50){

            System.out.println("  pass conded");
        }
        else if (final_mark>=40 && final_mark<49){
            System.out.println(" your qualify for sub");
        }
        else {
            System.out.println(" failed subminimum");
            System.out.println(" try again next time!!");
        }

       return final_mark;


    }
}