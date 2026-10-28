package exam;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends B {

}

class F extends C {

}

public class EX_ABCD {

	public static void main(String[] args) {

//		B bb = (B)new A();
//		System.out.println(bb);

		A a = new B();
		System.out.println(a);

		B bb = (B) a;
		System.out.println(bb);

	}
}
