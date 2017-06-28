package lxd.reflect.demo;

/**
 * 
 * 使用反射，测试打印类的成员变量
 * 
 * <pre>
 * 使用反射，测试打印类的成员变量
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class ClassDemo4 {
	
	public static void main(String[] args) {
		ClassUtil.printFiledMessage("hello", true);

		ClassUtil.printFiledMessage(new Integer(1), true);
	}
	
}
