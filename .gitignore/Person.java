
public class Person {
String name;
public Person() {

}
public Person(String name)
{
	this.name =name;
}
public static void main(String[] args) {
	Person p1 = new Person("ȫ�浿");
	System.out.println(p1.equals(new Person("ȫ�浿")));
	System.out.println(p1.equals(new Person("�ֿ���")));
	}
}
