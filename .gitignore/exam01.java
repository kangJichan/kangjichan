import java.*;
import java.util.Scanner;
public class exam01 {
	static int x = 0, y = 0, z = 0;
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("���� �� �� �Է�:");
		try {
			x = input.nextInt();
			y = input.nextInt();
			
		} catch (Exception e) {
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
			System.out.println("������ �ƴմϴ�.");
		}
		
		// TODO Auto-generated method stub

	}

}
