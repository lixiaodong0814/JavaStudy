package polymophism.music;

/*
 * sup.field 值为0 获取的是父类额field域
 * 只有普通方法的调用可以是多态的
 * 当Sub对象转型为Super引用时,任何域访问操作都将由编译器解析，因此不是多态的。
 * Sub类为Super.field和Sub.field分配了不同的存储空间。这样,Sub实际上
 * 包含两个称为field的域。然而, 在引用Sub中的field时所产生的默认域并非
 * Super中的field。因此,为了得到Super.field,必须显示地指明super.field
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
