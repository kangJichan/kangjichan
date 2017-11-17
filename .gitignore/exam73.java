
public class exam73 {
	int data = 0;
	
	public exam73() {
		System.out.println(data);
		data++;
	}
	public exam73(int data) {
		System.out.println(this.data);
		this.data += data;
	}

	public static void main(String[] args) {
	exam73 r1 = new exam73();
	System.out.println(r1.data);
	exam73 r2 = new exam73(5);
	System.out.println(r2.data);
	}

}
