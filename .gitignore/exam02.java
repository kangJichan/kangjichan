
class InvalidWithdraw extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
public class exam02 {
	public double minmoney = 0;
	public double money;
	public static double total;
	

	public exam02(int i) {
		this.total = i;
	}



	public double deposit(double money) throws InvalidWithdraw  {
		if(total<0) {
			throw new InvalidWithdraw("오류발생");
		}
		else {
		this.money = money;
		total += money;
		if(total<0) {
			throw new InvalidWithdraw("오류발생");
		}
		else {
		System.out.printf("정상 입금처리: 입금금액 = %s, 잔금 = %s %n", money, total);
		}
		}return total;
	}
	
	public double withdraw(double money) throws InvalidWithdraw {
		if(total<0) {
			throw new InvalidWithdraw("초과출금 요구 예외");
		}
		else {
		this.money = money;
		total -= money;
		if(total<0) {
			throw new InvalidWithdraw("초과출금 요구 예외");
		}
		else
		System.out.printf("정상 출금처리: 출금금액 = %s, 잔금 = %s %n", money, total);
		
		}return total;
	}


}
