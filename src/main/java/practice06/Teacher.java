package practice06;

import practice05.Person;

public class Teacher extends Person {
	
		public int klass;
		public int getKlass() {
			return klass;
		}
		public void setKlass(int klass) {
			this.klass = klass;
		}
		public Teacher(String name, int age) {
			super(name, age);
			
		}
		public Teacher(String name, int age, int klass) {
			super(name, age);
			this.klass = klass;
			// TODO Auto-generated constructor stub
		}
		
		
		public   String   introduce()
		{
			 // return "I am a Student. I am at Class "+this.klass+".";
	return 	"My name is "+this.name+". I am "+this.age+" years old. I am a Teacher. I teach  class "+this.klass+".";
		
		}
	
}
