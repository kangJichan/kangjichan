
public class Temporary extends Employee {
	public double hour;
	public double hourmoney = 10000;
	public double money;
	
	
	public double getMoney() {
		return hourmoney * hour;
	}


	public void setMoney(double money) {
		
	}

	public double getHour() {
		return hour;
		
	}


	public void setHour(int hour) {
		this.hour = hour;
		this.money =  hourmoney * hour;
	}

	public Temporary(String name, int old, String address, String part) {
		super(name, old, address, part);
		// TODO Auto-generated constructor stub
	}
	public void printInfo() {
		System.out.println("��������" + hour + money);
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
