package lxd.reflect.demo;

/**
 * 
 * 反射基础
 * 
 * <pre>
 * 反射基础
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class ClassDemo1 {

	public static void main(String[] args) {
		Foo foo = new Foo();//实例化foo对象
		
		Class c1 = Foo.class;//第一种方法，表明任何一个类都有一个隐含的静态成员变量class
		
		Class c2 = foo.getClass();//第二种方法，该类的对象可以通过getClass方法获得
		
		System.out.println(c1 == c2);
		
		Class c3 = null;
		try {
			c3 = Class.forName("lxd.reflect.demo.Foo");//第三种方法，
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c2 == c3);
		
		//通过类的类类型创建该类的对象实例
		try {
			Foo foo1 = (Foo) c1.newInstance();
			foo.print();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}

class Foo {

	void print() {
		System.out.println("foo");
	}

}
