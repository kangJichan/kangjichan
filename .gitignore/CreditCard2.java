
public class CreditCard2 {
	private long number;
	public String owner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard2 myCard = new CreditCard2();
		
		myCard.number = 3456_7654_8437_1273L;
		myCard.owner = "�� �缮";
		System.out.print("ī���ȣ:" + myCard.number);
		System.out.println(", ������:" + myCard.owner);
	}

}
