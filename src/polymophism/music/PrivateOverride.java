package polymophism.music;

/*
 * 希望输出Derived-->public void f()
 * 实际输出PrivateOverride-->private void f()
 * 父类中的私有f()自动被认为是final的，所以，Derived方法中f()是一个全新的方法
 * 子类调用的f()不能在子类中覆盖，所以调用的是父类的f() 
 * main出现在其他类中则不能调用PrivateOverride.f()
 */
class Derived extends PrivateOverride {
	//访问类型变宽,实际木有覆盖
	public void f() {
		System.out.println("Derived-->public void f()");
	}
	
}

public class PrivateOverride {
	
	private void f() {
		System.out.println("PrivateOverride-->private void f()");
	}
	
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}


