
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
		System.out.println("정규직" + money);
	}
	public static void main(String args[]) {
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		
		r.setMoney(5000000);
		r.printInfo();
		t.setHour(120);
		t.printInfo();
	}
	
}
