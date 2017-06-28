package lxd.annotation.demo;

/**
 * 
 * 注解demo1
 * 
 * <pre>
 * 人的接口
 * </pre>
 * 
 * @author lxd
 * 
 * 2017.03.17
 * 
 * @since 1.0
 *
 */
@Description("i am class")
public class Person {
	
	@Description("i am class method name()")
	public String name() {
		return null;
	}
	
	public int age() {
		return 0;
	}
	
	@Deprecated
	public void sing() {
		
	}
	
}
