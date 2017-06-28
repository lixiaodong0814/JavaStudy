package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * 
 * TimeTask调用demo
 * 
 * <pre>
 * 	TimeTask调用demo
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.21
 * 
 * @since 1.0
 *
 */
public class MyTimer {
	
	public static void main(String[] args) {
		//1.创建Timer实例
		Timer timer = new Timer();
		//2.创建TimerTask
		MyTimerTask timerTask = new MyTimerTask("No.1");
		//3.设定两秒后执行任务，以后每隔一秒执行一次
//		timer.schedule(timerTask, 2000L, 1000L);
		/*
		 * 获取当前时间，并设置成距离当前时间三秒之后的时间
		 * 
		 */
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("timer 类中 当前时间:" + sf.format(calendar.getTime()));
		calendar.add(Calendar.SECOND, 3);
		
		timerTask.setName("schedule");
		timer.schedule(timerTask, 3000);
		System.out.println("scheduled time is: " + sf.format(timerTask.scheduledExecutionTime()));
		
		/*
		 * schedule的第一种用法
		 * schedule(task,time)
		 * 在时间等于或超过time的时候执行且仅执行一次task
		 */
//		timerTask.setName("schedule1");
//		timer.schedule(timerTask, calendar.getTime());
		/*
		 * schedule的第二种用法
		 * schedule(task,time, period)
		 * 时间等于或超过time时首次执行task，之后每隔period毫秒重复执行一次task
		 */
//		timerTask.setName("schedule2");
//		timer.schedule(timerTask, calendar.getTime(), 2000);
		/*
		 * schedule的第三种用法
		 * schedule(task, delay)
		 * 等待delay毫秒后执行且仅执行一次task
		 */
//		timerTask.setName("schedule3");
//		timer.schedule(timerTask, 3000);
		/*
		 * schedule的第四种用法
		 * schedule(task, delay, period)
		 * 等待delay毫秒后首次执行task，之后每隔period毫秒重复执行一次task
		 */
//		timerTask.setName("schedule4");
//		timer.schedule(timerTask, 3000, 2000);
		
		/*
		 * scheduleAtFixedRate的第一种用法
		 * scheduleAtFixedRate(task, time, period)
		 * 时间等于或超过time时首次执行task，之后每隔period毫秒重复执行一次task
		 */
//		timerTask.setName("scheduleAtFixedRate1");
//		timer.scheduleAtFixedRate(timerTask, calendar.getTime(), 3000);
		
		/*
		 * scheduleAtFixedRate的第二种用法
		 * scheduleAtFixedRate(task, delay, period)
		 * 等待delay毫秒后首次执行task，之后每隔period毫秒重复执行一次task
		 */
//		timerTask.setName("scheduleAtFixedRate2");
//		timer.scheduleAtFixedRate(timerTask, 2000, 3000);
	}
	
}
