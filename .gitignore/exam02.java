
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
			throw new InvalidWithdraw("�����߻�");
		}
		else {
		this.money = money;
		total += money;
		if(total<0) {
			throw new InvalidWithdraw("�����߻�");
		}
		else {
		System.out.printf("���� �Ա�ó��: �Աݱݾ� = %s, �ܱ� = %s %n", money, total);
		}
		}return total;
	}
	
	public double withdraw(double money) throws InvalidWithdraw {
		if(total<0) {
			throw new InvalidWithdraw("�ʰ���� �䱸 ����");
		}
		else {
		this.money = money;
		total -= money;
		if(total<0) {
			throw new InvalidWithdraw("�ʰ���� �䱸 ����");
		}
		else
		System.out.printf("���� ���ó��: ��ݱݾ� = %s, �ܱ� = %s %n", money, total);
		
		}return total;
	}


}
