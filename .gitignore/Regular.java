
public class Regular extends Employee {
	public double money;
	
	public double getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Regular(String name, int old, String address, String part) {
		super(name, old, address, part);
	
	}
	public void printInfo() {
		System.out.println("������" + money);
	}
	public static void main(String args[]) {
		Employee r = new Regular("�̼���", 35, "����", "�λ��");
		Employee t = new Temporary("�庸��", 25, "��õ", "�渮��");
		
		r.setMoney(5000000);
		r.printInfo();
		t.setHour(120);
		t.printInfo();
	}
	
}
