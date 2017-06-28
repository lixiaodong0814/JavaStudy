package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * 
 * 跳舞和灌水机器人执行类
 * 
 * <pre>
 * 	 跳舞和灌水机器人执行类
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class TimerExecutor {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("current time is: " + sf.format(calendar.getTime()));
		
		DancingRobot dr = new DancingRobot();
		WaterRobot wr = new WaterRobot(timer);
		//每隔两秒跳一次舞
		timer.schedule(dr, calendar.getTime(), 2000);
		//每隔一秒灌一次水
		timer.scheduleAtFixedRate(wr, calendar.getTime(), 1000);
	}
	
}
