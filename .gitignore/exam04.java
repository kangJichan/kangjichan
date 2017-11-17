import java.util.*;

public class exam04{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] Weeks = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.print("연도를 입력하세요 : ");
		Integer year = input.nextInt();
		System.out.print("월을 입력하세요 : ");
		Integer month = input.nextInt();
		System.out.print("일을 입력하세요 : ");
		Integer day = input.nextInt();
		Calendar date = new GregorianCalendar(year, month, day);
		System.out.println("입력하신 날짜의 요일은 " + Weeks[date.get(Calendar.DAY_OF_WEEK) - 1] + "요일 입니다.");
	}
}