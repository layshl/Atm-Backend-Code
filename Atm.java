import java.util.*;

class Atm {

	public static void main(String[] args) {
		Bank_account obj = new Bank_account("XYZ", "134567");
		obj.Showmenu();
	}
}

class Bank_account {

	Bank_account(String cust_name, String Cust_id) {
		Customer_name = cust_name;
		Customer_id = Cust_id;
	}

	int previous_trans;
	int balance;
	String Customer_id;
	String Customer_name;

	void deposit(int amount) {
		balance = balance + amount;
		previous_trans = amount;
	}

	void withdraw(int amount) {
		balance = balance - amount;
		previous_trans = -amount;
	}

	void get_previous_trans() {
		if (previous_trans > 0) {
			System.out.println("Deposited Amount: " + previous_trans);
		} else if (previous_trans < 0) {
			System.out.println("Withdrawed Amount: " + Math.abs(previous_trans));
		} else {
			System.out.println("No transcation Occured");
		}
	}

	void Showmenu(){
		int inp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome "+Customer_name);
		System.out.println("Your Customer Id: "+Customer_id);
		System.out.println(" ");

		System.out.println("1. Check balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Previous Transaction");
		System.out.println("5. exit");
		System.out.println(" ");

		do{
			// System.out.println("=======================================================");
			System.out.println("Enter the input");
			System.out.println("=======================================================");
			System.out.println(" ");
			inp= sc.nextInt();


			switch(inp){
			case 1: 
				System.out.println("=======================================================");
				System.out.println("Your Balance is: "+balance);
				System.out.println("=======================================================");
				System.out.println(" ");
				break;
			case 2:
				System.out.println("=======================================================");
				System.out.println("Enter the amount to deposit: ");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("=======================================================");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("=======================================================");
				System.out.println("Enter the amount to withdraw: ");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("=======================================================");
				System.out.println(" ");
				break;
			case 4:
				System.out.println("=======================================================");
				get_previous_trans();
				System.out.println("=======================================================");
				System.out.println(" ");
			case 5:
				System.out.println("=======================================================");
				System.out.println(" ");
				break;
			
			default:
			System.out.println("Invalid Option!, please enter again");
			System.out.println(" ");
	
			}
		}while(inp != 5);
			System.out.println("Thank you for using services");
			System.out.println(" ");
		
	}

}