package lxd.reflect.demo;

/**
 * 
 * 用户的操作类
 * 
 * <pre>
 * 根据键盘输入的命令执行不同的方法
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class UserService {
	
	public void delete() {
		System.out.println("删除用户");
	}
	
	public void update() {
		System.out.println("修改用户");
	}
	
	public void find() {
		System.out.println("查找用户");
	}

}
