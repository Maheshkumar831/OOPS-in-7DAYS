package OOPS;
class A{
	final int rollno=5;
	String name;
	A(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
}
public class Mahe4 {
	public static void main(String args[]) {
		final A mahe=new A(60,"mahesh");
		//when a non primitive is final,we cannot reassign it,but we can change the value
		mahe.name="Kumar";
		//mahe=new A("kalai");//compile error
		System.out.println(mahe.rollno);//compile error
		//when a primitive type is final we cannot change the value

		System.out.println(mahe.name);//kumar
	}
}
