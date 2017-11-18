
public class Person {
String name;
public Person() {

}
public Person(String name)
{
	this.name =name;
}
public static void main(String[] args) {
	Person p1 = new Person("È«±æµ¿");
	System.out.println(p1.equals(new Person("È«±æµ¿")));
	System.out.println(p1.equals(new Person("ÃÖ¿µÅÂ")));
	}
}
