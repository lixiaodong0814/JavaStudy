package lxd.reflect.demo;

/**
 * 
 * JavaBean类有私有属性都对应有get/set方法，有无参数的构造方法.
 * 
 * <pre>
 * 	JavaBean类有私有属性都对应有get/set方法，有无参数的构造方法
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class User {

	private String username;
	private String userpass;
	private int age;
	
	public User() {}
	
	public User(String username, String userpass, int age) {
		super();
		this.username = username;
		this.userpass = userpass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
