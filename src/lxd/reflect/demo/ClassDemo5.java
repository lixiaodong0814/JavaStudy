package lxd.reflect.demo;

/**
 * 
 * 使用反射，测试打印类的构造函数
 * 
 * <pre>
 * 使用反射，测试打印类的构造函数
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class ClassDemo5 {
	
	public static void main(String[] args) {
		ClassUtil.printConMessage("hello", false);
		
		ClassUtil.printConMessage(new Integer(1), false);
	}

}
