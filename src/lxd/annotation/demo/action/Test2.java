package lxd.annotation.demo.action;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) {
		Filter f1 = new Filter();
		f1.setId(10);

		Filter f2 = new Filter();
		f2.setUserName("lucy");//模糊查询用户名为Lucy的用户
		f2.setAge(18);

		Filter f3 = new Filter();
		f3.setEmail("liu@sina.com,zh@163.com,7777@qq.com");//查询邮箱为其中任意一个的

		String sql1 = query(f1);
		String sql2 = query(f2);
		String sql3 = query(f3);
		
		Filter2 filter2 = new Filter2();
		filter2.setName("技术部");
		filter2.setAmount(20);
		String sql4 = query(filter2);
	}

	/**
	 * 
	 * 输出查询语句
	 * <pre>
	 * 输出查询语句
	 * </pre>
	 * 
	 * @author 李晓东
	 * @param f
	 * @return
	 */
	private static String query(Object f) {
		StringBuilder sb = new StringBuilder();
		//获取class对象
		Class c = f.getClass();
		//获取表名
		boolean exists = c.isAnnotationPresent(Table.class);
		if (!exists) {
			return null;
		}
		Table t = (Table) c.getAnnotation(Table.class);
		String tableName = t.value();

		sb.append(" select * from ").append(tableName).append(" where 1 = 1 ");

		//遍历所有的字段
		Field[] fAry = c.getDeclaredFields();
		for (Field field: fAry) {
			boolean isExists = field.isAnnotationPresent(Column.class);
			if (!isExists) {
				continue;
			}
			Column column = field.getAnnotation(Column.class);
			//拿到数据库列名
			String colName = column.value();

			String fieldName = field.getName();
			String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase()
					+ fieldName.substring(1);
			Method getMethod = null;
			Object fieldValue = null;
			try {
				getMethod = c.getMethod(getMethodName);
				//拿到字段值
				fieldValue = (Object) getMethod.invoke(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (fieldValue == null 
					|| (fieldValue instanceof Integer && (Integer)fieldValue == 0)) {

			} else if(fieldValue instanceof String) {
				
				if (((String)fieldValue).contains(",")) {

					String[] values = ((String)fieldValue).split(",");
					sb.append(" and ").append(colName).append(" in ").append(" ( ");
					for (String v: values) {
						sb.append("'").append(v).append("'").append(",");
					}
					sb.deleteCharAt(sb.length() - 1);
					sb.append(")");

				} else {

					sb.append(" and ").append(colName).append(" = ").append("'").append(fieldValue).append("'");
				}

			} else if(fieldValue instanceof Integer) {
				sb.append(" and ").append(colName).append(" = ").append(fieldValue);
				
			} 
		}
		System.out.println(sb.toString());

		return sb.toString();
	}

}
