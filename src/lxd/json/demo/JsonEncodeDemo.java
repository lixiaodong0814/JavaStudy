package lxd.json.demo;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class JsonEncodeDemo {
	public static void main(String[] args) throws IOException {
	/*	JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", 100);
		obj.put("balance", 1000.21);
		obj.put("is_vip", true);
		
		StringWriter out = new StringWriter();
		obj.writeJSONString(out);
		
		String jsonText = out.toString();

		System.out.println(jsonText);*/
		JSONParser parser = new JSONParser();
		String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		try {
			Object obj = parser.parse(s);
			JSONArray array = (JSONArray)obj;
			System.out.println("the 2nd element of array");
			System.out.println(array.get(1));
			System.out.println();
			
			JSONObject obj2 = (JSONObject)array.get(1);
			System.out.println("Field \"1\"");
			System.out.println(obj2.get("1"));
			
			s = "{}";
			obj = parser.parse(s);
			System.out.println(obj);
			
			s = "[5,]";
			obj = parser.parse(s);
			System.out.println(obj);
			
			s = "[5,,2]";
			obj = parser.parse(s);
			System.out.println(obj);
		} catch (ParseException pe) {
			System.out.println("positon: " + pe.getPosition());
			System.out.println(pe);
		}
	}
}