
public class UsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"C++", "Java", "C#"};
		for(String str : name)
			System.out.print(str + " ");
		System.out.println();
		
		String data[][] = {{"ȫ", "�浿"}, {"��", "��", "��"}, {"Tiger", "Woods"}};
		for (String ary[] : data) {
			for (String value : ary)
				System.out.print(value + " ");
			System.out.println();
		}
	}

}
