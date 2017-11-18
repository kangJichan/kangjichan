package exam;

public class Vehicle {
	public String name = "Â÷·®";
	protected double maxSpeed;
	private int seater;
	
	public Vehicle() {
		
	}
	public Vehicle(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.setSeater(seater);
		
	}
	public int getSeater() {
		return seater;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
}
