package OOPS;
class Student{
	int rollno;
	String name;
	double cgpa;
	Student(int rollno,String name,double cgpa){//parametrized constructor
		this.rollno=rollno;//this keyword refers to the current object
		this.name=name;//and it also differntiate the instance and local variable.
		this.cgpa=cgpa;
	}
	Student(){//default constructor
		rollno=43;
		name="kalai";
		cgpa=9.8;
	}
	void changeName(String newName) {
		name=newName;
	}
	void greeting() {
		System.out.println("Hi I am "+this.name);
	}
	
}
public class Mahe1 {
	public static void main(String args[]) {
		Student mahesh=new Student(57,"mahesh kumar",9.9);
		System.out.println(mahesh.rollno);//57
		System.out.println(mahesh.name);//mahesh
		System.out.println(mahesh.cgpa);//9.9
		Student random=new Student();
		System.out.println(random.rollno);//43
		
		mahesh.changeName("Mk");
		mahesh.greeting();//Hi I am MK
	}

}
