import java.util.Scanner;
public class Question5 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Books: ");
	int  numBooks = sc.nextInt();

	System.out.println("Is custemor is a member: ");
	boolean isMember = sc.nextBoolean();
	
	double PriceOfEachBook = 50;
	double MemberDiscount = 10/100.0;
	double AdditionalDiscount = 5/100.0;
	double FlatDiscount = 100.0;
	double TotalCost = numBooks * PriceOfEachBook;

	if (isMember) {
           TotalCost = TotalCost * MemberDiscount;
	} if (numBooks > 5) {
	   TotalCost = TotalCost *  AdditionalDiscount;
	} if (numBooks >= 10) {
	   TotalCost = TotalCost * FlatDiscount;
	} else {
	    System.out.println("Total cost is: "+ TotalCost);
	}
   }
}