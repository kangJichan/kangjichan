
public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	/**
	 * 신용카드 번호값을 
	 * @return
	 */
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	/**
	 * 신용카드의 번호값을 설정
	 * @return
	 */

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void use(int amount) {
		balance += amount;
		System.out.println("수령액 : " + amount + ", 지불잔액: " + balance);
	}
	
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액 : " + amount + ", 지불잔액: " + balance);
		addPoint(amount);
	}


	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("보너스 포인트 : " + point);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard myCard = new CreditCard();
		
		
		myCard.number = 3456_7654_8437_1273L;
		myCard.owner = "유 재석";
		System.out.print("카드번호:" + myCard.number);
		System.out.println(", 소유자:" + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
		CreditCard yourCard = new CreditCard();
		yourCard.number = 3292_7654_8437_1273L;
		yourCard.owner = "강 지찬";
		System.out.print("카드번호:" + yourCard.number);
		System.out.println(", 소유자:" + yourCard.owner);
		yourCard.use(20000);
		yourCard.payBill(10000);
		
		CreditCard secondCard = new CreditCard();
		secondCard.number = 1234_2321_4124_1231L;
		secondCard.owner = "강 지찬";
		System.out.print("카드번호:" + secondCard.number);
		System.out.println(", 소유자:" + secondCard.owner);
		secondCard.use(20000);
		secondCard.payBill(10000);
	}

}
