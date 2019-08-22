package practice02;

public class Student extends Person{
  public int klass;
	public Student(String name, int age,int i) {
		super(name, age);
		
	}
	public   String   introduce()
	{
		  return "I am a Student. I am at Class "+this.klass+".";
//		
	
	}
	
}
