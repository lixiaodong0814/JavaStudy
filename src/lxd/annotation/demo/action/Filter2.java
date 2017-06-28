package lxd.annotation.demo.action;

/**
 * 
 * 注解实战之过滤器实体类
 * 
 * <pre>
 * 注解实战之过滤器实体类
 * </pre>
 * 
 * @author 李晓东
 * 
 * 2017.03.17
 * 
 * @since 1.0
 *
 */
@Table("department")
public class Filter2 {
	
	@Column("id")
	private int id;
	
	@Column("name")
	private String name;
	
	@Column("amount")
	private int amount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
