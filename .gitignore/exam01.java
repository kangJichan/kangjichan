import java.*;
import java.util.Scanner;
public class exam01 {
	static int x = 0, y = 0, z = 0;
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("정수 두 개 입력:");
		try {
			x = input.nextInt();
			y = input.nextInt();
			
		} catch (Exception e) {
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
			System.out.println("정수가 아닙니다.");
		}
		
		// TODO Auto-generated method stub

	}

}
