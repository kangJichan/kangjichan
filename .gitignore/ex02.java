
public class ex02 {
	
	public static void main(String[] args) {
		for(int i=1; i<=8; i++) {
			int a = 1;
			for(int j=0; j<i;j++)
			{
				if(j==0) {
					for(int k=7-i; k>=0; k--) {
						System.out.print(" ");
						a++;
					}
				}
				if(j==0) {
					for(int k=8-a; k>0; k--)
						System.out.print(k);
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
