
public class Rresult01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1[] = {"�� ����", "�� ����", "�� ���", "�� ��"};
		String name2[] = {"Ÿ�̰� ����", "��Ƽ�� ��Ʈ����", "��Ű �Ŀ﷯", "ĳ�� ��"};
		
		System.arraycopy(name1, 0, name2, 0, name1.length);
		for(String name: name2)
			System.out.print(name + " ");
		System.out.println();
		for (String name: name1)
			System.out.print(name + " ");

		}
}