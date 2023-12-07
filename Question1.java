import java.util.Scanner;
public class Question1 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Takes a Grade: ");
	char grade = sc.nextLine.charAt(0);

	double gpa = 0;
	switch (grade) {
	    case 'A' :
		gpa = 4.0;
		break;
	    case 'B' :
		gpa = 3.0;
		break;
	    case 'C' :
		gpa = 2.0;
		break;
	    case 'D' :
		gpa = 1.0;
		break;
	    case 'E' :
		gpa = 0.0;
		break;
	    default :
                System.out.println("Invalid Grade");
       }
	 	System.out.println("GPA: "+gpa);
    }
}
	