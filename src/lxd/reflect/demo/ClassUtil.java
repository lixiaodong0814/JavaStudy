package lxd.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.SynchronousQueue;

public class ClassUtil {
	
	/**
	 * 
	 * 打印类的信息，包括类的成员函数、成员变量（只获取成员函数）
	 * <pre>
	 * 打印类的信息，包括类的成员函数、成员变量（只获取成员函数）
	 * </pre>
	 * 
	 * @author 李晓东
	 * 
	 * 2017.03.16
	 * 
	 * @param obj
	 * @param flag true获取所有该类自己声明的方法，false获取所有public的方法
	 */
	public static void printClassMethodMessage(Object obj, boolean flag) {
		//要获取类的信息，先获取类的类类型
		Class c = obj.getClass();
		//获取类的名称
		System.out.println("类的名称：");
		System.out.println("\t" + c.getName());
		
		/*
		 * Method类，方法对象
		 * 一个成员方法就是一个Method对象
		 * getMethods()方法获取的是所有的public的函数，包括父类继承而来的
		 * getDeclaredMethods()获取的是所有该类自己声明的方法，不问访问权限
		 */
//		Method[] methods = c.getMethods();
		Method[] methods = null;
		if (flag) {
			methods = c.getDeclaredMethods();
		} else {
			methods = c.getMethods();
		}
		
		
		System.out.println("方法: (" + methods.length + ")");
		for (int i=0; i<methods.length; i++) {
			//得到方法的返回值类型的类类型
			Class returnType = methods[i].getReturnType();
			System.out.print("\t" + returnType.getName() + " ");
			//得到方法的名称
			System.out.print(methods[i].getName() + "(");
			//获取参数类型： 得到的是参数列表的类型的类类型
			Class[] paramTypes = methods[i].getParameterTypes();
			for (Class class1: paramTypes) {
				System.out.print(class1.getName() + ", ");
			}
			System.out.println(")");
			
		}
		System.out.println("***************************************************************");
		
	}
	
	/**
	 * 
	 * 获取成员变量的信息
	 * <pre>
	 * 获取成员变量的信息
	 * </pre>
	 * 
	 * @author 李晓东
	 * @param obj
	 * @param flag true获取该类自己声明的成员变量，false获取所有的public的成员变量
	 */
	public static void printFiledMessage(Object obj, boolean flag) {
		Class c = obj.getClass();
		
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * Field类封装了关于成员变量的操作
		 * getFields()方法获取的是所有的public的成员变量的信息
		 * getDeclaredFields获取的是该类自己声明的成员变量的信息
		 */
		Field[] fs = null;
		if (flag) {
			fs = c.getDeclaredFields();
		} else {
			fs = c.getFields();
		}
		
		System.out.println("成员变量：(" + fs.length + ")");
		for (Field field: fs) {
			//得到成员变量的类型的类类型
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			
			//得到成员变量的名称
			String fieldName = field.getName();
			System.out.println("\t" + typeName + " " + fieldName);
		}
		System.out.println("***************************************************************");
	}
	
	/**
	 * 
	 * 打印对象的构造函数的信息
	 * <pre>
	 * 打印对象的构造函数的信息
	 * </pre>
	 * 
	 * @author 李晓东
	 * @param obj
	 * @param flag true得到所有的构造函数，false获取所有的public的构造函数
	 */
	public static void printConMessage(Object obj, boolean flag) {
		Class c = obj.getClass();
		
		/*
		 * 构造函数也是对象
		 * java.lang. Constructor中封装了构造函数的信息
		 * getConstructors获取所有的public的构造函数
		 * getDeclaredConstructors得到所有的构造函数
		 */
		//Constructor[] cs = c.getConstructors();
		Constructor[] cs = null;
		if (flag) {
			cs = c.getDeclaredConstructors();
		} else {
			cs = c.getConstructors();
		}
		
		
		System.out.println("构造函数：(" + cs.length + ")");
		for (Constructor constructor: cs) {
			System.out.print("\t" + constructor.getName() + "(");
			Class[] paramTypes = constructor.getParameterTypes();
			for (Class class1: paramTypes) {
				System.out.print(class1.getName());
			}
			System.out.println(")");
		}
		System.out.println("***************************************************************");
	}
	
}
