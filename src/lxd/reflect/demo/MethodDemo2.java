package lxd.reflect.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class MethodDemo2 {

	public static void main(String[] args) {
		UserService us = new UserService();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("请输入命令:"); 
		try {
			String action = bf.readLine();
			Class c = us.getClass();
			Method m = c.getMethod(action);
			m.invoke(us);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
