
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1000000;
		double b = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("������� �Է��ϼ��� :");
		int year = input.nextInt();
		for(int a = year ; a > 0 ; a--){
										
					b = x * (4.5 / 100) * a;
					x += b;
					System.out.print(x);
					System.out.println();
					
			
		}
	}

}
