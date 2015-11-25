package innerclasses;

/*
 * 创建一个内部类，然后继承其外部类并重新定义此内部类。
 * 并没有什么用
 * 如下例子说明，当继承了某个外部类的时候，内部类并没有发生什么神奇的情况
 * 这两个内部类是完全独立的两个实体，各自在自己的命名空间内
 * 可以明确的继承某个内部类
 */
class Egg {
	private Yolk y;

	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk{}");
		}
		
		public void f() {
			System.out.println("Egg.Yolk.f()");
		}
	}

	public Egg() {
		System.out.println("new Egg()");
		y = new Yolk();
	}
	
	public void insertYolk(Yolk yy) {
		y = yy;
	}
	
	public void g() {
		y.f();
	}
}

public class BigEgg extends Egg {
	public class Yolk extends Egg.Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk{}");
		}
		
		public void f() {
			System.out.println("BigEgg.Yolk.f()");
		}
	}

	public BigEgg() {
	//	System.out.println("new BigEgg()");
	//	new Yolk();
	//	new Egg().new Yolk();
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg e = new BigEgg();
		e.g();
	}
}
