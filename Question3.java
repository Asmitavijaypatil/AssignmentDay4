import java.util.Scanner;
public class Question3 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Given Character: ");
	char ch = sc.next().charAt(0);

	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	   System.out.print("Given Character is vowel: "+ch);
	} else {
	   System.out.print("Given Character is Consonant: "+ch) ;
	}
   }
}  
