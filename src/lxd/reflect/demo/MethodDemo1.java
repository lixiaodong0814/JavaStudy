package lxd.reflect.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * 利用反射，动态调用类的方法
 * 
 * <pre>
 * 利用反射，动态调用类的方法
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class MethodDemo1 {

	public static void main(String[] args) {
		A a1 = new A();
		Class c = a1.getClass();

		try {
			Method m = c.getMethod("print", int.class, int.class);
			//Method m = c.getMethod("print", new Class[] {int.class, int.class});

			//方法的反射操作是用m对象来进行方法调用 和a1.print调用的效果完全相同
			//方法如果没有返回值返回null,有返回值返回具体的返回值
			m.invoke(a1, 10, 20);
		//	m.invoke(a1, new Object[]{10,20});
			System.out.println("====================================");
			
			Method m1 = c.getMethod("print", String.class, String.class);
			m1.invoke(a1, "hello", "WORLD");
			System.out.println("====================================");

			Method m2 = c.getMethod("print");
			m2.invoke(a1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class A {

	public void print() {
		System.out.println("hello world");
	}

	public void print(int a, int b) {
		System.out.println(a + b);
	}

	public void print(String a, String b) {
		System.out.println(a.toUpperCase() + ", " + b.toLowerCase());
	}

}