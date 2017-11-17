import java.util.*;
import java.lang.*;
public class exam07 implements Runnable {
	private int end;
	private String name;
	
	public exam07(int end) {
		this.end = end;
	}
	public exam07(int end, String name) {
		this.end =end;
		this.name = name;
	}

	public void run() {
		for(int i =1; end >= i; i++) {
			Date now = new Date();
			System.out.printf("순위: %s %s %s %n", Thread.currentThread().getPriority() ,now ,Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String args[]) {
		exam07 p1 = new exam07(3);
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		exam07 p2 = new exam07(6);
		Thread th2 = new Thread(p2, "반갑습니다.");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
		
	}
}
