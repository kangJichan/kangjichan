package exam;

public class Motor extends Vehicle{
		public String name = "�ڵ���";
		public int displacement;
		
	public Motor() {
		super(); // ��������
	}
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		this.maxSpeed = maxSpeed;
		this.setSeater(seater); 
		this.displacement = displacement;
	}
		
	public void printInfo() {
		System.out.print(super.name + ":" + this.name);
		System.out.println("�ִ�ӵ� :" + maxSpeed );
		System.out.print("���� :" + getSeater() + "�� ");
		System.out.println("��ⷮ :" + displacement + "cc");
	}
	
	public static void main(String[] args) {
	Motor myCar = new Motor(300, 4, 5000);
	myCar.printInfo();
	}
}