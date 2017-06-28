package lxd.command.demo;

/**
 * jstat(JVM Statistics Monitoring Tool)是用于监控虚拟机各种运行状态信息的命令行工具。
 * 他可以显示本地或远程虚拟机进程中的类装载、内存、垃圾收集、JIT编译等运行数据，
 * 在没有GUI图形的服务器上，它是运行期定位虚拟机性能问题的首选工具。
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JstatDemo {

	/*
	 * jstat位于java的bin目录下，主要利用JVM内建的指令对Java应用程序的资源和性能进行实时的命令行的监控，
	 * 包括了对Heap size和垃圾回收状况的监控。可见，Jstat是轻量级的、专门针对JVM的工具，非常适用。
	 */
	
	/*
	 * jstat –class<pid> : 显示加载class的数量，及所占空间等信息。
	 * 
	 * jstat -compiler <pid>显示VM实时编译的数量等信息。
	 * 
	 * jstat -gc <pid>: 可以显示gc的信息，查看gc的次数，及时间。
	 * 
	 * jstat -gccapacity <pid>:可以显示，VM内存中三代（young,old,perm）对象的使用和占用大小
	 * 
	 * jstat -gcutil <pid>:统计gc信息
	 * 
	 * jstat -gcnew <pid>:年轻代对象的信息。
	 * 
	 * jstat -gcnewcapacity<pid>: 年轻代对象的信息及其占用量。
	 * 
	 * jstat -gcold <pid>：old代对象的信息。
	 * 
	 * stat -gcoldcapacity <pid>: old代对象的信息及其占用量。
	 * 
	 * jstat -gcpermcapacity<pid>: perm对象的信息及其占用量。
	 * 
	 * jstat -printcompilation <pid>：当前VM执行的信息。
	 */
}
