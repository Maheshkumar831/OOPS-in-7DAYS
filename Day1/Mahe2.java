package OOPS;
class Student1{
	int rollno;
	String name;
	double cgpa;
	Student1 (Student1 other){
		this.rollno=other.rollno;
		this.name=other.name;
		this.cgpa=other.cgpa;
	}
	Student1(){
		//this is how you call a constructor from another constructor
		//internally:new Student(57,"kalaiyarsi",9.9)
		this(57,"kalaiyarasi",9.9);
	}
	Student1(int rollno,String name,double cgpa){
		this.rollno=rollno;
		this.name=name;
		this.cgpa=cgpa;
	}
}
public class Mahe2 {
	public static void main(String args[]) {
		Student1 mahesh=new Student1(57,"mahesh kumar",9.9);
		/*System.out.println(mahesh.name);
		System.out.println(mahesh.rollno);
		System.out.println(mahesh.cgpa);*/
		Student1 kalai=new Student1(mahesh);
		System.out.println(kalai.name);//mahesh kumar
		System.out.println(kalai.rollno);//57
		Student1 kalaiyarasi=new Student1();
		System.out.println(kalaiyarasi.name);//kalaiyarasi
		Student1 one=new Student1();
		Student1 two=one;
		one.name="Mahe Mahe";//One and two objects are pointed to same memory location
		System.out.println(two.name);//Mahe Mahe
	}

}
