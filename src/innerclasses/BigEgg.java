package innerclasses;

/*
 * ����һ���ڲ��࣬Ȼ��̳����ⲿ�ಢ���¶�����ڲ��ࡣ
 * ��û��ʲô��
 * ��������˵�������̳���ĳ���ⲿ���ʱ���ڲ��ಢû�з���ʲô��������
 * �������ڲ�������ȫ����������ʵ�壬�������Լ��������ռ���
 * ������ȷ�ļ̳�ĳ���ڲ���
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
