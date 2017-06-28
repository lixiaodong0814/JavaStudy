package lxd.reflect.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * JavaBean帮助类
 * 
 * <pre>
 * 	JavaBean帮助类
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.16
 * 
 * @since 1.0
 *
 */
public class BeanUtil {

	
	public static Object getValueByPropertyName(Object obj, String propertyName) {
		//根据属性名称可以获取其get方法
		String getMethodName = "get" 
				+ propertyName.substring(0, 1).toUpperCase()
				+ propertyName.substring(1);
		
		//获取方法对象
		Class c = obj.getClass();
		
		try {
			Method m = c.getMethod(getMethodName);
			Object value;
			value = m.invoke(obj);
			return value;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} 
		
	}
	
}
