package lxd.pattern.demo.observer.bean.base;

/**
 * 观察者模式--主题
 * @author lxd
 * @date 2017年2月8日
 */
public interface Subject {
	/**
	 * 注册观察者
	 * @author 李晓东
	 *
	 * @param o
	 */
	void registerObserver(Observer o);
	
	/**
	 * 删除观察者
	 * @author 李晓东
	 *
	 * @param o
	 */
	void removeObserver(Observer o);
	
	/**
	 * 主题状态改变时，调用该方法，通知所有的观察者
	 * @author 李晓东
	 *
	 */
	void notifyObservers();
}
