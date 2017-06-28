package lxd.command.demo;

/**
 * jstack是java虚拟机自带的一种堆栈跟踪工具。
 * 主要用来查看Java线程的调用堆栈的，可以用来分析线程问题（如死锁）。
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JStackDemo2 {

	public static void main(String[] args) {
	  
		/*
		 * 虚拟机执行Full GC时,会阻塞所有的用户线程。因此,即时获取到同步锁的线程也有可能被阻塞。 在查看线程Dump时,首先查看内存使用情况。
		 */
		Thread t1 = new Thread(new DeadLockClass(true));
		Thread t2 = new Thread(new DeadLockClass(false));
		//开启线程
		t1.start();
		t2.start();
		
		/*
		 * 执行结果
		 *  Found one Java-level deadlock:
			=============================
			"Thread-1":
			  waiting to lock monitor 0x0000000008af6228 (object 0x00000000d62ecb40, a java.lang.Object),
			  which is held by "Thread-0"
			"Thread-0":
			  waiting to lock monitor 0x0000000008af8b68 (object 0x00000000d62ecb50, a java.lang.Object),
			  which is held by "Thread-1"
			
			Java stack information for the threads listed above:
			===================================================
			"Thread-1":
			        at lxd.command.demo.DeadLockClass.run(JStackDemo2.java:59)
			        - waiting to lock <0x00000000d62ecb40> (a java.lang.Object)
			        - locked <0x00000000d62ecb50> (a java.lang.Object)
			        at java.lang.Thread.run(Unknown Source)
			"Thread-0":
			        at lxd.command.demo.DeadLockClass.run(JStackDemo2.java:48)
			        - waiting to lock <0x00000000d62ecb50> (a java.lang.Object)
			        - locked <0x00000000d62ecb40> (a java.lang.Object)
			        at java.lang.Thread.run(Unknown Source)
			
			Found 1 deadlock.
		 */
	}
	
}

/**
 * 死锁程序类
 * @author lxd
 * @date 2017年2月3日
 */
class DeadLockClass implements Runnable {

	public boolean flag;//控制线程
	
	public DeadLockClass(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		/*
		 * 如果flag的值为true则调用t1线程
		 */
		if (flag) {
			while (true) {
				synchronized(Suo.o1) {
					System.out.println("o1 " + Thread.currentThread().getName());
					
					synchronized(Suo.o2) {
						System.out.println("o2 " + Thread.currentThread().getName());
					}
				}
			}
			
		} else {//如果为false调用t2线程
			while (true) {
				synchronized(Suo.o2) {
					System.out.println("o2 " + Thread.currentThread().getName());
					
					synchronized(Suo.o1) {
						System.out.println("o1 " + Thread.currentThread().getName());
					}
				}
			}
			
		}
	}
	
}

class Suo {
	static Object o1 = new Object();
	static Object o2 = new Object();
}
