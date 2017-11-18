
public class exam74 {
	double value = 3.4;
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double add(double value) {
		return this.value += value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam74 rs =new exam74();
		rs.setValue(7.3);
		rs.add(2.7);
		System.out.println(rs.getValue());
	}

}
