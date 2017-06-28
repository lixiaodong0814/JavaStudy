package lxd.command.demo;

/**
 * jmap是JDK自带的工具软件，主要用于打印指定Java进程(或核心文件、远程调试服务器)
 * 的共享对象内存映射或堆内存细节。可以使用jmap生成Heap Dump
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JmapDemo {

	/*
	 * Java虚拟机的内存组成以及堆内存介绍 Java GC工作原理 常见内存错误：
		outOfMemoryError 年老代内存不足。
		outOfMemoryError:PermGen Space 永久代内存不足。
		outOfMemoryError:GC overhead limit exceed 垃圾回收时间占用系统运行时间的98%或以上。
	 */
	
	public static void main(String[] args) {
		/*
		 * jmap
		 * 指定进程号(pid)的进程 jmap [ option ] 指定核心文件 jmap [ option ] 指定远程调试服务器 jmap [ option ] [server-id@]
		 * 
		 * 查看java 堆（heap）使用情况:jmap -heap 进程号[pid]
		 * 
		 * 查看堆内存(histogram)中的对象数量及大小：jmap -histo 进程号[pid]
		 * jmap -histo:live 这个命令执行，JVM会先触发gc，然后再统计信息。
		 * 
		 * 将内存使用的详细情况输出到文件
		 * jmap -dump:format=b,file=<fileName> 进程号[pid]  
		 * 如：fileName为 heapDump
		 * 
		 * 然后用jhat命令（内存分析工具）可以参看 jhat -port 5000 heapDump 在浏览器中访问：http://localhost:5000/ 查看详细信息
		 * 这个命令执行，JVM会将整个heap的信息dump写入到一个文件，heap如果比较大的话，就会导致这个过程比较耗时，
		 * 并且执行的过程中为了保证dump的信息是可靠的，所以会暂停应用。
		 */
	}
	
}
