package polymophism.music;

/*
 * sup.field ֵΪ0 ��ȡ���Ǹ����field��
 * ֻ����ͨ�����ĵ��ÿ����Ƕ�̬��
 * ��Sub����ת��ΪSuper����ʱ,�κ�����ʲ��������ɱ�������������˲��Ƕ�̬�ġ�
 * Sub��ΪSuper.field��Sub.field�����˲�ͬ�Ĵ洢�ռ䡣����,Subʵ����
 * ����������Ϊfield����Ȼ��, ������Sub�е�fieldʱ��������Ĭ���򲢷�
 * Super�е�field�����,Ϊ�˵õ�Super.field,������ʾ��ָ��super.field
 */
class Super {
	public int field = 0;
	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;
	public int getField() {
		return field;
	}
	public int getSuperField() {
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field 
				+ ", sub.getField() = " + sub.getField()
				+ ", sub.getSuperField() = " + sub.getSuperField());

	}
}
