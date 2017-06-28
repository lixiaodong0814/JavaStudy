package lxd.annotation.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnn {
	
	public static void main(String[] args) {
		try {
			//使用类加载器加载类
			Class c = Class.forName("lxd.annotation.demo.Child");
			
			//2.找到类上的注解
			boolean isExist = c.isAnnotationPresent(Description.class);
			if (isExist) {
				//3. 拿到注解实例
				Description d = (Description)c.getAnnotation(Description.class);
				System.out.println(d.value());
			}
			//找到方法上的注解
			Method[] ms = c.getMethods();
			for (Method m: ms) {
				boolean isMExist = m.isAnnotationPresent(Description.class);
				if (isMExist) {
					Description d = (Description)m.getAnnotation(Description.class);
					System.out.println(d.value());
				}
			}
			System.out.println("=========================================");
			//另一种解析方法
			for(Method m: ms) {
				Annotation[] as = m.getAnnotations();
				for (Annotation a: as) {
					if (a instanceof Description) {
						Description d = (Description)a;
						System.out.println(d.value());
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
