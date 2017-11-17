
public class exam71 {
	double x, y;
	
	public double add() {
		return x + y;
	}
	public double subtract() {
		return x - y;
	}
	
	public static void main(String[] args) {
		exam71 r1 = new exam71();
		r1.x = 4.79;
		r1.y = 2.21;
		System.out.println(r1.add());
		System.out.println(r1.subtract());
	}
}
