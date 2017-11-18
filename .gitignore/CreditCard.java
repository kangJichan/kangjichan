
public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	/**
	 * �ſ�ī�� ��ȣ���� 
	 * @return
	 */
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	/**
	 * �ſ�ī���� ��ȣ���� ����
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
		System.out.println("���ɾ� : " + amount + ", �����ܾ�: " + balance);
	}
	
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("���Ҿ� : " + amount + ", �����ܾ�: " + balance);
		addPoint(amount);
	}


	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("���ʽ� ����Ʈ : " + point);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard myCard = new CreditCard();
		
		
		myCard.number = 3456_7654_8437_1273L;
		myCard.owner = "�� �缮";
		System.out.print("ī���ȣ:" + myCard.number);
		System.out.println(", ������:" + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
		CreditCard yourCard = new CreditCard();
		yourCard.number = 3292_7654_8437_1273L;
		yourCard.owner = "�� ����";
		System.out.print("ī���ȣ:" + yourCard.number);
		System.out.println(", ������:" + yourCard.owner);
		yourCard.use(20000);
		yourCard.payBill(10000);
		
		CreditCard secondCard = new CreditCard();
		secondCard.number = 1234_2321_4124_1231L;
		secondCard.owner = "�� ����";
		System.out.print("ī���ȣ:" + secondCard.number);
		System.out.println(", ������:" + secondCard.owner);
		secondCard.use(20000);
		secondCard.payBill(10000);
	}

}
