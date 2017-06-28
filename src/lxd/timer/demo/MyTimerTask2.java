package lxd.timer.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTimerTask2 extends TimerTask {
	private String name;

	private long costTime;
	
	public MyTimerTask2(String name, long costTime) {
		this.name = name;
		this.costTime = costTime;
	}
	
	@Override
	public void run() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(name + "'s current exec time is: " 
				+ sf.format(calendar.getTime()));
		try {
			Thread.sleep(costTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calendar = Calendar.getInstance();
		System.out.println(name + "'s finish time is: " 
				+ sf.format(calendar.getTime()));
		//加上测试运行时异常
		throw new RuntimeException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCostTime() {
		return costTime;
	}

	public void setCostTime(long costTime) {
		this.costTime = costTime;
	}
	
}
