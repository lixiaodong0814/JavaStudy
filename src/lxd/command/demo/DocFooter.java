package lxd.command.demo;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * 测试Javap命令
 * 
 * @author lxd
 * @date 2017年2月3日
 */
public class DocFooter extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8061730183994370619L;
	
	String date;
	String email;
	
	public void init() {
		resize(500, 100);
		date = getParameter("LAST_UPDATED");
		email = getParameter("EMAIL");
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(date + " by ", 100, 15);
		g.drawString(email, 200, 15);
	}
	
}
