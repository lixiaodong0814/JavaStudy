package innerclasses;

class MNA {
	private void f() {System.out.println("MNA-->f()");}
	class A {
		private void f() {System.out.println("MNA.A-->f()");}
		public class B {
			void f() {System.out.println("MNA.A.B-->f()");}
			void h() {
				new MNA().f();
				new MNA().new A().f();
				f();
			}
		}
	}
}

public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}
