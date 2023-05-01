package CheckingAccount;

public class Withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountNumber = 23432122;
		double beforebal = 30000.00;
		double withdraw = 3000.00;

		if (accountNumber == 23432122) {
			System.out.println("Access Granted");

			double Res = beforebal - withdraw;
			System.out.println("You withdraw " + withdraw);
			System.out.println("Your Remain Balance is " + Res);
		}
	}
}