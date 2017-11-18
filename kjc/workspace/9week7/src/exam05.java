import java.util.*;
public class exam05 {
 public static void main(String args[]) {
	 Calendar now = Calendar.getInstance();
	 int DOW = now.get(Calendar.DAY_OF_WEEK);
	 String DOW1 = "";
	 if(DOW == 1) {
		 DOW = '일';
	 }
	 if(DOW == 2) {
		 DOW = '월';
	 }
	 if(DOW == 3) {
		 DOW = '화';
	 }
	 if(DOW == 4) {
		 DOW = '수';
	 }
	 if(DOW == 5) {
		 DOW = '목';
	 }
	 if(DOW == 6) {
		 DOW = '금';
	 }
	 if(DOW == 7) {
		 DOW = '토';
	 }
	 System.out.println("오늘은"+now.get(Calendar.YEAR)+"년"+(now.get(Calendar.MONTH)+1)+"월"+now.get(Calendar.DATE)+"일"+DOW1+"요일입니다");		//출력코드입니다
		System.out.println(now.DAY_OF_WEEK_IN_MONTH+"째 주입니다");				
		System.out.println(now.WEEK_OF_MONTH);								
		System.out.println(now.DAY_OF_YEAR);								
		System.out.println(now.WEEK_OF_YEAR);		 
 }
}
