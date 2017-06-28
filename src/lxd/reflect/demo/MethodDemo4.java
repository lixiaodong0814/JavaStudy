package lxd.reflect.demo;

import java.lang.reflect.Method;
import java.util.ArrayList;

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
public class MethodDemo4 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hello");
//		list1.add(20);//不能添加
		
		Class c1 = list.getClass();
		Class c2 = list1.getClass();
		
		System.out.println(c1 == c2);
		
		
		try {
			Method m = c2.getMethod("add", Object.class);
			m.invoke(list1, 20);//绕过编译操作，即绕过了泛型
			System.out.println(list1.size());
			System.out.println(list1);
			
			/*
			 * 绕过编译后，现在不能这样遍历
			 * java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			 */
			/*for (String string : list1) {
				System.out.println(string);
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
