package precious_aine;
import java.util.Scanner;

public class university_sys {

	public static void main(String[] args) {
		
		   
        int marks[] = new int[6];
        int i;
        float total=0, avg;
       Scanner input  = new Scanner(System.in);
		
       System.out.print("       SYTEM FOR GRADING COURSE WORK MARKS  ");
   	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
   	System.out.println("Enter marks for the following six course units ");
   	
        for(i=0; i<6; i++) { 
        	
        	
           System.out.print("Enter Mark for course unit ("+(i+1)+"):");
           marks[i] = input.nextInt();
           total = total + marks[i];
        }
//        Scanner.close();
        avg = total/6;
    	System.out.println(" ");
    	System.out.println(" ");
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }

	
	
		input.close();

	}
}
