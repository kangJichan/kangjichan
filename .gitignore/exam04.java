import java.util.*;

public class exam04{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] Weeks = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.print("������ �Է��ϼ��� : ");
		Integer year = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		Integer month = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		Integer day = input.nextInt();
		Calendar date = new GregorianCalendar(year, month, day);
		System.out.println("�Է��Ͻ� ��¥�� ������ " + Weeks[date.get(Calendar.DAY_OF_WEEK) - 1] + "���� �Դϴ�.");
	}
}