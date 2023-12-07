import java.util.Scanner;
public class Question4 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("User weight in kilogram: ");
	Double weight = sc.nextDouble();

	System.out.println("User height in meter: ");
	Double height = sc.nextDouble();

	Double BMI = weight / (height * height);

	if (BMI < 18.5) {
	   System.out.println("Underweight");
	} else if (BMI < 25) {
	   System.out.println("Normal"); 
 	} else if (BMI < 30) {
	   System.out.println("Overweight");
	} else {
	   System.out.println("Obese");
	}
    }
}