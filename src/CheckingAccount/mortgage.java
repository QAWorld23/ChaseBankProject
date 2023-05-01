package CheckingAccount;

public class mortgage {
	
	public static void main(String[] args) {
		//  write a program in java which will determine mortgage eligibility -age must be 18+
	/*	-credit score more than
		600 if equifax
		650 if TransUnion 
		700 if Experian   */
		
		int age = 19;
		int creditscore = 500;
		
		if (age < 18){
			System.out.println("Sorry, you must be 18 yrs to apply for mortgage");
		}else if (creditscore >=600 && creditscore <=649) {
			System.out.println("Equifax Score! Congratulations! You are eligible for a mortgage" );
		}else if (creditscore >=650 && creditscore<=699 ) {
				System.out.println("TransUnion Score! Congratulations! You are eligible for a mortgage" );
		}else if (creditscore >=700 ) {
			System.out.println("Experian Score! Congratulations! You are eligible for a mortgage" );
		}else {
			System.out.println("Sorry, you are not eligible for a mortgage at this time.");
				
		}
	}

}
