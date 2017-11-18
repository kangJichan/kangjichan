
public class Rresult01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1[] = {"최 경주", "김 경태", "김 비오", "배 상문"};
		String name2[] = {"타이거 우즈", "스티븐 스트리거", "리키 파울러", "캐빈 나"};
		
		System.arraycopy(name1, 0, name2, 0, name1.length);
		for(String name: name2)
			System.out.print(name + " ");
		System.out.println();
		for (String name: name1)
			System.out.print(name + " ");

		}
}