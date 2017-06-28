package lxd.command.demo;

/**
 * 
 * jps(Java Virtual Machine Process Status Tool)
 * 是JDK 1.5提供的一个显示当前所有java进程pid的命令，简单实用，
 * 非常适合在linux/unix平台上简单察看当前java进程的一些简单情况。
 * 
 * jps仅查找当前用户的Java进程，而不是当前系统中的所有进程。
 * 
 * jps -help查看帮助
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JpsDemo {
	
	/*
	 * jdk中的jps命令可以显示当前运行的java进程以及相关参数，它的实现机制如下：
	 * java程序在启动以后，会在java.io.tmpdir指定的目录下，就是临时文件夹里，生成一个类似于hsperfdata_User的文件夹，
	 * 这个文件夹里（在Linux中为/tmp/hsperfdata_{userName}/），
	 * 有几个文件，名字就是java进程的pid，因此列出当前运行的java进程，
	 * 只是把这个目录里的文件名列一下而已。 至于系统的参数什么，就可以解析这几个文件获得。
	 */
	
	/**
	 * 
	 * @author 李晓东
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 *JPS 只能显示当前用户的Java进程,要显示其他用户的还是只能用unix/linux的ps命令
		 * 
		 * -q 只显示pid，不显示class名称,jar文件名和传递给main 方法的参数
		 * 
		 * -m 输出传递给main 方法的参数，在嵌入式jvm上可能是null
		 * 
		 * -l(小写L) 输出应用程序main class的完整package名 或者 应用程序的jar文件完整路径名
		 * 
		 * -v 输出传递给JVM的参数  
		 * 如果想知道这个应用的日志会输出到哪里，或者启动的时候使用了哪些javaagent，
		 * 可以使用jps -v 查看进程的jvm参数情况。
		 * 
		 */
		while (true) {
			System.out.println(1);
		}
		
		/*
		 * 1.如何给main传递参数 在eclipse中，鼠标右键->Run As->Run COnfiguations->Arguments->
		 * 在Program arguments中写下要传的参数值
		 * 
		 * 1.如何给JVM传递参数 在eclipse中，鼠标右键->Run As->Run COnfiguations->Arguments->
		 * 在VM arguments中写下要传的参数值（一般以-D开头）
		 */
		
	}
	
}
