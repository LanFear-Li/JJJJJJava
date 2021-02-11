abstract class Person {
	public Person() {
		func();
	}

	public Person(int x) {
		System.out.println("second person");
	}

	public void func() {
		System.out.println("person");
	}
}

abstract class People {
	public People() {
		func();
	}
	public void func() {
		System.out.println("people");
	}
	
	public abstract void funone();
}

class human {
	public human() {
		func();
	}
	public void func() {
		System.out.println("human");
	}
}

public class Person_A extends Person {
	public Person_A() {
		super();
	}

	public Person_A(int a) {
		System.out.println(a);
	}

	public void func() {
		System.out.println("person_a");
	}

	public static void main(String[] args) {
		Person_A pa = new Person_A();
		Person_A pb = new Person_A(3);
	}
}




