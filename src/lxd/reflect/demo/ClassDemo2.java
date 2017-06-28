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
public class ClassDemo2 {
	
	public static void main(String[] args) {
		Class c1 = int.class;
		Class c2 = String.class;
		Class c3 = double.class;
		Class c4 = Integer.class;
		Class c5 = void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());//不包含包名的类的名称
		System.out.println(c4.getName());
		System.out.println(c4.getSimpleName());
		System.out.println(c5.getName());
	}
	
}
