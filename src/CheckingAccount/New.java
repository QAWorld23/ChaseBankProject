package CheckingAccount;

public class New {

	public static void main(String[] args) {


		// Display GPA grade letter based on score:

		/*
		 * Score: 0-1 F grade
		 * 
		 * Score: 2-3 B grade
		 * 
		 * Score: >3 A grade
		 */

		int score = 1;

		if (score <= 1) {
			System.out.println("You got F grade");
		}
		else if(score <= 2 && score <= 3)
			System.out.println("You got B grade");
		else {
			System.out.println("You got A!!!! You score higher than 3");
		}
	}


}
