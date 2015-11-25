package innerclasses;

/*
 * 使用局部内部类原因：
 * 		需要一个已命名的构造器，或者需要重加载构造器，
 * 		需要不止一个该内部类的对象。
 * 		而匿名内部类只能用于实例初始化
 */
interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;
	
	Counter getCounter(final String name) {
		class LocalCounter implements Counter {
			public LocalCounter() {
				System.out.println("LocalCounter Constructor initialized");
			}
			
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		
		return new LocalCounter();
	}
	
	Counter getCounter2(final String name) {
		return new Counter() {
			//匿名内部类不能有一个实际构造函数，它只是一个实例初始化
			//Counter()
			{
				System.out.println("Counter()");
			}
			
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter
			c1 = lic.getCounter("Local inner"),
			c2 = lic.getCounter2("Anonymous inner");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(c1.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c2.next());
		}
	}
	
}
