package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * 
 * Timer的缺陷demo
 * 
 * <pre>
 * Timer的缺陷demo,不支持并发
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class MyTimer2 {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTimerTask2 task1 = new MyTimerTask2("No.1", 2000);
		MyTimerTask2 task2 = new MyTimerTask2("No.2", 2000);
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("current time is: " + sf.format(calendar.getTime()));
		timer.schedule(task1, calendar.getTime());
		timer.schedule(task2, calendar.getTime());
//		timer.scheduleAtFixedRate(task1, calendar.getTime(), 2000);
//		timer.scheduleAtFixedRate(task2, calendar.getTime(), 2000);
	}
	
}
