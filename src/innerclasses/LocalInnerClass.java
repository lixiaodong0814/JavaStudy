package innerclasses;

/*
 * ʹ�þֲ��ڲ���ԭ��
 * 		��Ҫһ���������Ĺ�������������Ҫ�ؼ��ع�������
 * 		��Ҫ��ֹһ�����ڲ���Ķ���
 * 		�������ڲ���ֻ������ʵ����ʼ��
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
			//�����ڲ��಻����һ��ʵ�ʹ��캯������ֻ��һ��ʵ����ʼ��
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
