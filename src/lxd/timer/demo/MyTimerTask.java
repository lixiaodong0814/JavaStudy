package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

/**
 * 
 * 任务调度timer demo.
 * 
 * <pre>
 *  任务调度timer demo.
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.21
 * 
 * @since 1.0
 *
 */
public class MyTimerTask extends TimerTask {
	
	private String name;
	
	private Integer count = 0;
	
	public MyTimerTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		if (count < 3) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("current exec time is: " + sf.format(calendar.getTime()));
			System.out.println("current timeTask name: " + name);
			count++;
		} else {
			cancel();
			System.out.println("Task cancel!");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
