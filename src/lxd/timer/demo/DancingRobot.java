package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

/**
 * 
 * 跳舞机器人综合demo
 * 
 * <pre>
 * 	跳舞机器人综合demo
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class DancingRobot extends TimerTask {

	@Override
	public void run() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Scheduled exec time is: " 
				+ sf.format(scheduledExecutionTime()));
		System.out.println("Dancing happily!");
	}

}
