
public class Continue {
	public static void main(String[] args) {
		// 이 프로그램은  while문의 기능을 알아보기 위한 프로그램 입니다.
		int i = 1;
		
	for(i = 1; i <= 10; i++)
	{
		if(i%3==0) continue;
		System.out.print(i + " ");
	}
	System.out.println();
	}
}
