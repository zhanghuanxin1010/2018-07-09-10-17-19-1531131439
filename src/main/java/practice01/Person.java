package practice01;

public class Person {
	public static String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int age;
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public   String   introduce()
	{
		  return "My name is " + this.name + ". I am "+this.age+" years old.";
//		System.out.println("My name is Tom. I am 21 years old.");
		//return "My name is Tom. I am 21 years old.";
		//return result;
	}
	/*public static void main() {
		Person person = new Person("Tom", 21);
		person.introduce();
	}*/
	
}
