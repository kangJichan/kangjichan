
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("������ �Է��ϼ��� :");
		int num = input.nextInt();
		do {
				
			int a = num % 10;
			System.out.print(a);
			num /= 10;
			
		}while(num != 0);
			
	}

}
