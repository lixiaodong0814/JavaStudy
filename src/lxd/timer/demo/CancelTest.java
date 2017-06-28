package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * 
 * 取消定时任务实体类测试
 * 
 * <pre>
 * 	取消定时任务实体类
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class CancelTest {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		//创建TimeTask实例
		MyTimerTask task1 = new MyTimerTask("task1");
		MyTimerTask task2 = new MyTimerTask("task2");
		//获取当前的执行时间并打印
		Date startTime = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("start time is: " + sf.format(startTime));
		timer.schedule(task1, 3000, 2000);
		timer.schedule(task2, 1000, 2000);
		System.out.println("current canceled task number is: " + timer.purge());
		//休眠5秒
		Thread.sleep(2000);
		//获取当前的执行时间并打印
		Date cancelTime = new Date();
		System.out.println("cancel time is: " + sf.format(cancelTime));

		//取消所有任务
		//		timer.cancel();
		//		System.out.println("Task all canceled!");

		//取消其中一个任务
		task2.cancel();
		System.out.println("current canceled task number is: " + timer.purge());
	}

}
