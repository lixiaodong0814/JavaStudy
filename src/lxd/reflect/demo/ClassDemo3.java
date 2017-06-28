package lxd.reflect.demo;

/**
 * 
 * 使用反射，测试打印类方法
 * 
 * <pre>
 * 使用反射，测试打印类方法
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class ClassDemo3 {
	
	public static void main(String[] args) {
		String s = "hello";
		ClassUtil.printClassMethodMessage(s, true);
		
		Integer n1 = 1;
		ClassUtil.printClassMethodMessage(n1, true);
	}
	
}
