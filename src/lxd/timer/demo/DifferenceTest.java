package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * schedule与scheduleAtFixedRate的区别
 * 
 * <pre>
 * 	schedule与scheduleAtFixedRate的区别测试
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class DifferenceTest {

	public static void main(String[] args) {
		//规定时间格式
		final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//获取当前的具体时间
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current time is: " + sf.format(calendar.getTime()));
		/*
		 * 1.首次计划执行的时间早于当前的时间
		 */
		//设置成6秒前的时间，
		//		calendar.add(Calendar.SECOND, -6);
		//		Timer timer = new Timer();

		//第一次执行时间为6秒前，之后没隔两秒执行一次
		/*timer.schedule(new TimerTask() {

			@Override
			public void run() {
				//打印当前的计划执行时间
				System.out.println("scheduled execc time is: " 
						+ sf.format(scheduledExecutionTime()));
				System.out.println("Task is being executed!");
			}
		}, calendar.getTime(), 2000);*/
		/*timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				//打印当前的计划执行时间
				System.out.println("scheduled execc time is: " 
						+ sf.format(scheduledExecutionTime()));
				System.out.println("Task is being executed!");
			}
		}, calendar.getTime(), 2000);*/
		/*
		 * 2.任务执行所需时间超出任务的执行周期间隔
		 */
		Timer timer = new Timer();
		/*timer.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("scheduled execc time is: " 
						+ sf.format(scheduledExecutionTime()));
				System.out.println("Task is being executed!");
			}
		}, calendar.getTime(), 2000);*/
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("scheduled execc time is: " 
						+ sf.format(scheduledExecutionTime()));
				System.out.println("Task is being executed!");
			}
		}, calendar.getTime(), 2000);

	}

}
