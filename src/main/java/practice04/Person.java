package practice04;

public class Person {
	

	
		public static String name;
		public static int age;
		public Person(String name,int age) {
			this.age=age;
			this.name=name;
		}
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
		public   String   introduce()
		{
			  return "My name is " + this.name + ". I am "+this.age+" years old.";
//			
		
		}
	


}
