import java.util.*;
public class exam05 {
 public static void main(String args[]) {
	 Calendar now = Calendar.getInstance();
	 int DOW = now.get(Calendar.DAY_OF_WEEK);
	 String DOW1 = "";
	 if(DOW == 1) {
		 DOW = '��';
	 }
	 if(DOW == 2) {
		 DOW = '��';
	 }
	 if(DOW == 3) {
		 DOW = 'ȭ';
	 }
	 if(DOW == 4) {
		 DOW = '��';
	 }
	 if(DOW == 5) {
		 DOW = '��';
	 }
	 if(DOW == 6) {
		 DOW = '��';
	 }
	 if(DOW == 7) {
		 DOW = '��';
	 }
	 System.out.println("������"+now.get(Calendar.YEAR)+"��"+(now.get(Calendar.MONTH)+1)+"��"+now.get(Calendar.DATE)+"��"+DOW1+"�����Դϴ�");		//����ڵ��Դϴ�
		System.out.println(now.DAY_OF_WEEK_IN_MONTH+"° ���Դϴ�");				
		System.out.println(now.WEEK_OF_MONTH);								
		System.out.println(now.DAY_OF_YEAR);								
		System.out.println(now.WEEK_OF_YEAR);		 
 }
}
