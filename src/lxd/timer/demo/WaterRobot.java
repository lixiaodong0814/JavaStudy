package lxd.timer.demo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * 灌水机器人综合demo
 * 
 * <pre>
 * 	灌水机器人综合demo
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class WaterRobot extends TimerTask {

	private Timer timer;
	
	//最大容量为5L
	private Integer bucketCapacity = 0;
	
	public WaterRobot(Timer timer) {
		this.timer = timer;
	}
	
	@Override
	public void run() {
		//灌水直至桶满为止
		if (bucketCapacity < 5) {
			System.out.println("current bucketCapacity: " + bucketCapacity);
			System.out.println("Add 1L water into the bucket");
			bucketCapacity++;
		} else {
			//水满之后就停止执行
			System.out.println("the number of canceled task is: " + timer.purge());
			cancel();
			System.out.println("the number of canceled task is: " + timer.purge());
			System.out.println("bucketCapacity is full：" + bucketCapacity);
			System.out.println("the waterRobot has been aborted!");
			
			//等待两秒
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timer.cancel();
		}
	}

}
