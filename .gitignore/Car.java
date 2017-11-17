public class Car {
	private int maxSpeed;
	public String brandName;
	public int speed;
	
	public Car(String brandName) {
		this.brandName = brandName;
		
	}
	public Car(String brandName, int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}
	public int speedUp() {
		return speed += 30;
	}
	public int speedDown() {
		return speed -= 20;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car mycar = new Car("������ ", 300);
		mycar.speedUp();
		mycar.speedUp();
		System.out.print("����" + mycar.brandName);
		System.out.print(", �ְ�ӵ�" + mycar.getMaxSpeed());
		System.out.println(", ����ӵ�" + mycar.speedDown());
	}

}
