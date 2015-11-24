package innerclasses;

/*
 * �����ڲ���
 * ʹ��һ�������ⲿ����Ķ�����������ñ�����final
 */
class Wrapping {
	private int i = 11;
	
	public Wrapping(int x) {
		i = x;
	}
	
	public int value() {
		return i;
	}
}

public class Parcel7 {
	public Contents contents(final int x) {
		return new Contents() {
			private int i = x;
			
			@Override
			public int value() {
				return i;
			}
		};
	}
	
	public Wrapping contents2(int x) {
		return new Wrapping(x);
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents(22);
		System.out.println(c.value());
		
		Wrapping w = p.contents2(20);
		System.out.println(w.value());
	}
}
