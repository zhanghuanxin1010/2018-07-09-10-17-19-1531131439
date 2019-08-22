package practice04;

public class Student extends Person {
	public int klass;
	public int getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}
	public Student(String name, int age,int i) {
		super(name, age);
		
	}
	public   String   introduce()
	{
		  return "I am a Student. I am at Class "+this.klass+".";
//		
	
	}
}

