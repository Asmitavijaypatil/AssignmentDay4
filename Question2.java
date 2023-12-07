import java.util.Scanner;
public class Question2 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age: ");
	int age = sc.nextInt();

	System.out.println("Enter time of the movie in 24hrs format: ");
	int movietime = sc.nextInt();

	double child_price = 5.00;
        double adult_price = 10.00;
	double seniors_price = 7.50;

	double afternoon_discount = 2.00;
	double evening_discount = 3.00;

	double actual_price = 0.0;

	if (age >= 0 && age <= 12) {
	    actual_price = child_price;
	} else if (age >= 13 && age <= 59) {
	    actual_price = adult_price;
	} else {
	    actual_price = seniors_price;
 	}
	
	if (movietime >= 15 && movietime <= 18) {
	    actual_price = actual_price - afternoon_discount;
	}  if (movietime > 18) {
	    actual_price = actual_price - evening_discount;
	} 

	System.out.println("Ticket Price Rs: "+actual_price); 
  }
} 
