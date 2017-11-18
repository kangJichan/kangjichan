
public class CreditCard2 {
	private long number;
	public String owner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard2 myCard = new CreditCard2();
		
		myCard.number = 3456_7654_8437_1273L;
		myCard.owner = "유 재석";
		System.out.print("카드번호:" + myCard.number);
		System.out.println(", 소유자:" + myCard.owner);
	}

}
