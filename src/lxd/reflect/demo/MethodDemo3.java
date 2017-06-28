package lxd.reflect.demo;

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
public class MethodDemo3 {
	
	public static void main(String[] args) {
		User u1 = new User("zhangsan", "123456", 30);
		
		System.out.println(BeanUtil.getValueByPropertyName(u1, "username"));
		System.out.println(BeanUtil.getValueByPropertyName(u1, "userpass"));
		
	}
	
}
