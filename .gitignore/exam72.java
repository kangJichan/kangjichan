
public class exam72 {
	static int objCnt;
	int cnt = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam72 r1 = new exam72();
		r1.objCnt = 5;
		r1.cnt = 7;
		
		exam72 r2 = new exam72();
		r2.objCnt = 10;
		r2.cnt = 9;
		
		System.out.printf("%d %d %d %n",  r1.objCnt, r2.objCnt, exam72.objCnt);
		System.out.printf("%d %d %n", r1.cnt, r2.cnt);
		
	}

}
