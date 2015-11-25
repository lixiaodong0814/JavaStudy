package innerclasses;

/*
 * 内隐类问题
 * 继承内部类，当要生成一个构造器时，默认的构造器并不算好
 * 而且不能只是传递一个指向外围类对象的引用。
 * 1.此外，必须在构造器内使用enclosingClassReference.super()
 * 不然不能编译通过，会出现这种问题：
 * No enclosing instance of type WithInner
 * is available due to some intermediate constructor invocation
 * 2.内部类相当于外部类的一个变量，你可以写成静态的，外部类InheritInner才能调用Inner类的构造方法，
 * InheritInner才能写构造函数
 *  
 */
class WithInner {
//	static class Inner {}
	class Inner {}
}

public class InheritInner extends WithInner.Inner {
//	public InheritInner() {}
	public InheritInner(WithInner wi) {
		wi.super();
	}
}
