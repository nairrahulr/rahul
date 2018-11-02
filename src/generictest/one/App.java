package generictest.one;

import java.lang.reflect.Field;

public class App {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println("----------------------- A Class -------------------------");
		Field[] fl = a.getClass().getFields();
		printProperties(fl);
		System.out.println("----------------------- B Class -------------------------");
		Field[] flb = b.getClass().getFields();
		printProperties(flb);
		
	}

	private static void printProperties(Field[] fl) {
		for(Field f: fl) {
			System.out.print("Field name ::");
			String nameOfField = f.getName();
			System.out.println(nameOfField);
			System.out.print("Field type :: ");
			Class<?> type = f.getType();
			System.out.println(type.getName());
		}
	}

}

class A{
	
	public String rahul = "testone";
	public float rahulFloat = 2f;
	
}
class B extends A{
	public String rahulChild = "childvalue";
}
