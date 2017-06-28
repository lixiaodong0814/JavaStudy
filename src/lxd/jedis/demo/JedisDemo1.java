package lxd.jedis.demo;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 
 * Jedis的测试
 * 
 * <pre>
 * 	Jedis的测试
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.05.28
 * 
 * @since 1.0
 *
 */
public class JedisDemo1 {
	
	/**
	 * 
	 * 单实例的测试,连接redis
	 * <pre>
	 * 单实例的测试
	 * </pre>
	 * 
	 * @author 李晓东
	 */
	@Test
	public void demo1() {
		//1.设置IP地址和端口
		Jedis jedis = new Jedis("127.0.0.1", 6379);
//		jedis.auth("lxd0814");
		//2.保存数据
		jedis.set("name", "lxd");
		//3.获取数据
		String value = jedis.get("name");
		System.out.println(value);
		//4.释放资源
		jedis.close();
	}
	
	/**
	 * 
	 * 连接池方式连接
	 * <pre>
	 * 	连接池方式连接
	 * </pre>
	 * 
	 * @author 李晓东
	 */
	@Test
	public void demo2() {
		//获得连接池的配置对象
		JedisPoolConfig config = new JedisPoolConfig();
		//设置最大连接数
		config.setMaxTotal(30);
		//设置最大空闲连接数
		config.setMaxIdle(10);
		
		
		//获得连接池
//		JedisPool jedisPool = new JedisPool(config, "127.0.0.1", 6379, 2000, "lxd0814");
		JedisPool jedisPool = new JedisPool(config, "127.0.0.1", 6379);
		//获得核心对象
		Jedis jedis = null;
		try {
			//通过连接池获得连接
			jedis = jedisPool.getResource();
			//设置数据
			jedis.set("name2", "lxd002");
			//获取数据
			String value = jedis.get("name2");
			System.out.println(value);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (jedis != null) {
				jedis.close();
			}
			if (jedisPool != null) {
				jedisPool.close();
			}
		}
	}
	
}
