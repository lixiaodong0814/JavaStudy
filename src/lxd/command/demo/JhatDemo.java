package lxd.command.demo;

/**
 * jhat(Java Heap Analysis Tool),是一个用来分析java的堆情况的命令。
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class JhatDemo {

	public static void main(String[] args) {
		while (true) {
			String str = new String("lixiaodong");
			System.out.println(str);
		}
	}
	
}
