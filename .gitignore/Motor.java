package exam;

public class Motor extends Vehicle{
		public String name = "자동차";
		public int displacement;
		
	public Motor() {
		super(); // 생략가능
	}
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		this.maxSpeed = maxSpeed;
		this.setSeater(seater); 
		this.displacement = displacement;
	}
		
	public void printInfo() {
		System.out.print(super.name + ":" + this.name);
		System.out.println("최대속도 :" + maxSpeed );
		System.out.print("정원 :" + getSeater() + "명 ");
		System.out.println("배기량 :" + displacement + "cc");
	}
	
	public static void main(String[] args) {
	Motor myCar = new Motor(300, 4, 5000);
	myCar.printInfo();
	}
}