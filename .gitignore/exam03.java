
public class exam03 extends exam02 {
	public exam03(int total) {
		super(total);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws InvalidWithdraw {
		exam02 ba = new exam02(0);
		ba.deposit(100000);
		ba.withdraw(100000);
		ba.withdraw(200000);
	}
}

