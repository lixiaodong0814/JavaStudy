package lxd.pattern.demo.observer.bean.base;

/**
 * 观察者模式--观察者
 * @author lxd
 * @date 2017年2月8日
 */
public interface Observer {
	/**
	 * 气象观测值改变时，主题会把这些状态值当做方法的参数，传递给观察者
	 * @author 李晓东
	 *
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	void update(float temperature, float humidity, float pressure);
}
