package OOPS;

/*public class Mahe4 {
	public static void main(String args[]) {

		//int a=10;
		//int b=20;
		//swap(a,b);
		//System.out.println(a+" "+b);//10,20 we cannot change the values
		//java follows strictly pass by value.
		//changes only in respective methods but not changes in original 
		//object.so remains the same value.
		Integer num1=10;
		Integer num2=20;
		swap2(num1,num2);
		System.out.println(num1+" "+num2);//10,20
		
	}
	static void swap2(Integer num1,Integer num2) {
		Integer temp=num1;
		num1=num2;
		num2=temp;
		//System.out.println(num1+" "+num2);//20 10
		
	}
	/*static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);//20 10.
	}


}
*/
class Mahe{
	final int num=10;
	String name;
	public Mahe(String name) {
		System.out.println("Object is created");
		this.name=name;
	}
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Object is destroyed");
	}
}
public class Mahe4{
	public static void main(String args[]) {
		Mahe obj;
		for(int i=0;i<100000;i++) {
			obj=new Mahe("MAHESH");
		}
	}
}
//In a finalize method to perform cleanup operation.when a new object is created old object is destroyed collect the garbage collector.
