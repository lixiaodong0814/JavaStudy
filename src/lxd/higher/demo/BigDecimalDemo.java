package lxd.higher.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 
 * BigDecimal Demo
 * 
 * <pre>
 * 	BigDecimal Demo
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.10
 * 
 * @since 1.0
 *
 */
public class BigDecimalDemo {

	public static void main(String[] args) {
		double   f   =   111231.5555;  
		BigDecimal   b   =   new   BigDecimal(f);  
		double   f1   =   b.setScale(2,   RoundingMode.HALF_DOWN).doubleValue();  
		System.out.println(f1);
	}
	
}
