package lxd.command.demo;

/**
 * jstack是java虚拟机自带的一种堆栈跟踪工具。
 * 主要用来查看Java线程的调用堆栈的，可以用来分析线程问题（如死锁）。
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JStackDemo1 {

	public static void main(String[] args) {
		/*
		 * "Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x0000000008962000 nid=0x2078 in Object.wait()
		 * [0x0000000009cbe000]
		 * java.lang.Thread.State: WAITING (on object monitor)
		 * 		at java.lang.Object.wait(Native Method)
		 * 		- waiting on <0x00000000d8110a48> (a java.lang.ref.Reference$Lock)
		 *      at java.lang.Object.wait(Unknown Source)
		 *      at java.lang.ref.Reference.tryHandlePending(Unknown Source)
		 *      - locked <0x00000000d8110a48> (a java.lang.ref.Reference$Lock)
		 *      at java.lang.ref.Reference$ReferenceHandler.run(Unknown Source)
		 *      
		 *      
		 * 线程的状态： WAITING 线程的调用栈 线程的当前锁住的资源： <0x00000000d8110a48> 线程当前等待的资源：<0x00000000d8110a48>
		 * 
		 * 线程的执行中，先获得了这个对象的 Monitor（对应于 locked <0x00000000d8110a48>）。当执行到 obj.wait(), 
		 * 线程即放弃了 Monitor的所有权，进入 “wait set”队列（对应于 waiting on <0x00000000d8110a48> ）。
		 */
	   Thread thread = new Thread(new Thread1());
	   thread.start();
	}
	
}

class Thread1 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("jstackdemo1");
		}
	}
	
}
