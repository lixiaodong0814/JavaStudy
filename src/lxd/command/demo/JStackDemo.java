package lxd.command.demo;

/**
 * jstack是java虚拟机自带的一种堆栈跟踪工具。
 * 主要用来查看Java线程的调用堆栈的，可以用来分析线程问题（如死锁）。
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JStackDemo {

	public static void main(String[] args) {
	   /*
		* "main" #1 prio=5 os_prio=0 tid=0x000000000030e800 nid=0x2b48 runnable [0x0000000002dcf000]
		* java.lang.Thread.State: RUNNABLE
		* at lxd.command.demo.JStackDemo.main(JStackDemo.java:13)
		*/
		while (true) {
			//do nothing
		}
	}
	
}
